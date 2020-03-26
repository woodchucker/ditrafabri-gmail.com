package fabrizio.message;

import fabrizio.controller.ControllerVisitor;
import fabrizio.model.Persona;

public class TrovaPersonaMessage extends Message {

	public TrovaPersonaMessage(Persona p) {
		setPersona(p);
	}

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitTrovaPersonaController();

	}

}
