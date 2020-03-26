package message;

import controller.ControllerVisitor;

public class HelloMessage extends Message{

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitHelloMessage();
		
	}

}
