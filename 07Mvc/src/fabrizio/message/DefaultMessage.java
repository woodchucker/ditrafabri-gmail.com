package fabrizio.message;

import fabrizio.controller.ControllerVisitor;

public class DefaultMessage extends Message {

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitDefaultController();

	}

}
