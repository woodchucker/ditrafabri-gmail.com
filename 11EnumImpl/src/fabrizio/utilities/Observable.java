package fabrizio.utilities;

import java.util.ArrayList;

public class Observable {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	public void subscribe(Observer o) {
		observers.add(o);
	}
	
	public void unsubscribe() {}
	
	public void notifyObservers(Observable ob) {
		for (Observer o: observers)
			o.update(ob);
	}
}
