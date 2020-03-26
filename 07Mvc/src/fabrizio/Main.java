package fabrizio;

import fabrizio.controller.ActionController;
import fabrizio.model.Registro;
import fabrizio.view.View;

public class Main {

	public static void main(String[] args) {
		
		Registro model = new Registro();
		View view = new View();
		ActionController controller = new ActionController();
		
		controller.setRegistro(model);
		
		view.subscribe(controller);
		model.subscribe(view);
		
		while (true) {
			view.richiediInput();
		}
	}

}
