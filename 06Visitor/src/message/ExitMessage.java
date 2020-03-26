package message;

import controller.ControllerVisitor;

public class ExitMessage extends Message {

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitExitMessage();
		
	}

}
