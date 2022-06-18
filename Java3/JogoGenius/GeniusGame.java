import java.util.*;

public class GeniusGame implements Subject
{
	private int sequenceLength = 1;
	private Vector<FlashColors> sequenceColors; 
	private List<GeniusObserver> observers;
	int score;
	boolean isGameOver = false;
	
	public GeniusGame()
	{
		observers = new ArrayList<GeniusObserver>();
		sequenceColors = new Vector<FlashColors>();
	}
	
	public void play()
	{
		
		for(int i = 0 ; i < sequenceLength ; i++)
		{
			int randomNumber = new Random().nextInt()%4;
			if(randomNumber < 0)
				randomNumber = randomNumber *-1;
			mapColor(randomNumber);
		}
		notifyObservers();
	}
	
	private void mapColor(int randomColor)
	{
		if(randomColor ==  0)
			sequenceColors.add(FlashColors.Red);
		else if(randomColor ==  1)
			sequenceColors.add(FlashColors.Blue);
		else if(randomColor ==  2 )
			sequenceColors.add(FlashColors.Green);
		else if(randomColor ==  3 )
			sequenceColors.add(FlashColors.Yellow);
		
	}

	public void checkUserInput(Vector<FlashColors> userInput)
	{
		if(compareUserInput(userInput))
		{
			score = score + 1;
			play();
		}
		else
			gameOver();
	}
	
	private boolean compareUserInput(Vector<FlashColors> userInput)
	{
		boolean result = true;
		for(int i = 0; i < userInput.size() ; i++)
		{
			if(userInput.get(i) != sequenceColors.get(i))
			{
				result = false;
			}
		}
		return result;
	}
	
	private void gameOver() 
	{
		score = 0;
		isGameOver = true;
		notifyObservers();
	}

	public void restart()
	{
		sequenceLength = 1;
		sequenceColors.clear();
		score = 0;
		isGameOver = false;
		play();
	}

	@Override
	public void notifyObservers()
	{
		for(int i =0; i<observers.size(); i++)
		{
			GeniusObserver observer = observers.get(i);
			observer.nextColorSequence(sequenceColors);
			observer.turnOver();
			observer.gameOver(isGameOver);
			observer.updateScore(score);
		}
	}

	@Override
	public void registerObserver(GeniusObserver o) 
	{
		if(!observers.contains(o))
			observers.add(o);
		else
			throw new IllegalArgumentException("Observer já Presente");
	}

	@Override
	public void removeObserver(GeniusObserver o) 
	{
		int i = observers.indexOf(o);
		if(i >= 0 )
			observers.remove(i);
		else
			throw new IllegalArgumentException("Observer não Encontrado");		
	}
}