package fabrizio.utilities;

import java.util.ArrayList;

public abstract class Observable {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void subscribe(Observer o) {
		observers.add(o);
	}
	
	public void notifyObservers(Observable o ) {
		for(Observer ob: observers) {
			ob.update(o);
		}
	}

}
