package fabrizio.message;

import fabrizio.controller.ControllerVisitor;
import fabrizio.model.Persona;

public class RemoveMessage extends Message {

	public RemoveMessage(Persona p) {
		this.setPersona(p);
	}
	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitRemovePersonaController();

	}

}
