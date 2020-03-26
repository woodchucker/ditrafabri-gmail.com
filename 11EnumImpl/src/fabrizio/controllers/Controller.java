package fabrizio.controllers;

import fabrizio.enums.Action;
import fabrizio.utilities.Observable;
import fabrizio.utilities.Observer;
import fabrizio.views.View;

public abstract class Controller implements Observer{
	private Action a;
	private View v;
	
	@Override
	public void update(Observable o) {
		setV( (View)o );
		
	}

	public abstract void doAction();

	public Action getA() {
		return a;
	}

	public void setA(Action a) {
		this.a = a;
	}

	public View getV() {
		return v;
	}

	public void setV(View v) {
		this.v = v;
	}

}
