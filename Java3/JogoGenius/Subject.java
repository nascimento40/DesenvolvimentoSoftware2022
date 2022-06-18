public interface Subject 
{
	public void registerObserver(GeniusObserver o);
	 
	public void removeObserver(GeniusObserver o);
	  
	public void notifyObservers();
}
