public class ProgramaPrincipal 
{
	public static void main(String[] args) 
	{
		GeniusGame game = new GeniusGame();
		
		GeniusGameUi ui = new GeniusGameUi(game);
		ui.setLocation(100,100);
		game.registerObserver(ui);
		game.play();
	}

}
