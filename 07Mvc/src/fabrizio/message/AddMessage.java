package fabrizio.message;

import fabrizio.controller.ControllerVisitor;
import fabrizio.model.Persona;

public class AddMessage extends Message {
	

	public AddMessage(Persona p) {
		super();
		this.setPersona(p);
	}

	@Override
	public void visit(ControllerVisitor cv) {

		cv.visitAddPersonaController();

	}

}
