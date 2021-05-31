package observer;

public interface Observable{
	public int update();
	public void attach(Observer observer);
	public void remove(Observer observer);
	public void notifyObs();


}
