package fabrizio;

import fabrizio.controllers.ActionController;
import fabrizio.models.Registro;
import fabrizio.views.View;

public class Main {
	
	

	public static void main(String[] args) {

		Registro r = new Registro();
		ActionController ac = new ActionController(r);
		View view = new View();
		view.subscribe(ac);
		while(true) {
			view.richiediInput();
		}

	}

}
