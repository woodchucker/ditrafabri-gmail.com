package fabrizio;

import java.util.ArrayList;
import java.util.HashSet;

public class Observable {

	private HashSet<Observer> observers = new HashSet<Observer>();
	
	public void subscribe(Observer o) {
		observers.add(o);
	}
	
	public void unsubscribe(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers(Observable obs) {
		for(Observer o: observers) {
			o.update(obs);
		}
	}
}
