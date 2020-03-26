package fabrizio.message;

import fabrizio.controller.ControllerVisitor;

public class ListaPersoneMessage extends Message {

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitListaPersoneController();

	}

}
