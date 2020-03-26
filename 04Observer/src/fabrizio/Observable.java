package fabrizio;

import java.util.ArrayList;

public abstract class Observable {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void subscribe(Observer o) {
		observers.add(o);	
	}
	public void unsubscribe(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers(Observable obs) {
		for (Observer o: observers) {
			o.update(obs);
		}
	}
}
