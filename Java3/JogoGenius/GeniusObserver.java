import java.util.Vector;

public interface GeniusObserver 
{
	public void nextColorSequence(Vector<FlashColors> sequenceColors);
	
	public void turnOver();
	
	public void gameOver(boolean isGameOver);
	
	public void updateScore(int score);
}

