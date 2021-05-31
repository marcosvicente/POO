package observer;

import java.util.ArrayList;

public class Carta  implements Observable{
	private ArrayList<Observer> obs= new ArrayList<Observer>();

	
	public void setState(int state) {
		this.state = state;
		
		notifyObs();
	}
	
	public void attach(Observer observer) {
		obs.add(observer);
	}
	
	public void remove(Observer observer) {
		obs.remove(observer);
	}
	
	public void notifyObs() {
		for (Observer o : obs) {
			o.update();
		}
	}
	
}
