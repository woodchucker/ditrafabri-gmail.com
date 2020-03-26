package utilities;

import java.util.ArrayList;

public class Observable {

	ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void subscribe(Observer o){
		observers.add(o);
	}
	
	public void unsubscribe(Observer o) {
		observers.remove(o);
	}
	
	public void emit(Observable obs) {
		for (Observer o: observers) {
			o.update(obs);
		}
	}
}
