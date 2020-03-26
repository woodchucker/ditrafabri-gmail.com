package fabrizio;

import fabrizio.controller.ActionController;
import fabrizio.model.Registro;
import fabrizio.view.View;

public class MainClass {
	
	public static void main(String[] args) {
		Registro model = new Registro();
		View view = new View();
		ActionController controller = new ActionController(model);
		
		view.subscribe(controller);
		model.subscribe(view);
		
		while(true) {
			view.richiediInput();
			view.mostraOutput();
		}
	}

}
