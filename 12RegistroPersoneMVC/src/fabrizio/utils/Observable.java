package fabrizio.utils;

import java.util.ArrayList;

public abstract class Observable {
	
	ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void subscribe(Observer o) {
		observers.add(o);
	}
	
	public void notifyObservers(Observable obs) {
		for(Observer o: observers) {
			o.update(obs);
		}
	}

}
