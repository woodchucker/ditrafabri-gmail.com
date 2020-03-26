package message;

import controller.ControllerVisitor;

public class DefaultMessage extends Message{

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitDefaultMessage();
		
	}

}
