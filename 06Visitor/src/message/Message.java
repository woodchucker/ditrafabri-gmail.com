package message;

import controller.ControllerVisitor;

public abstract class Message {

	public abstract void visit(ControllerVisitor cv);
	
	public void visit(ControllerVisitor... cvs) {
		
		for(ControllerVisitor cv: cvs) {
			this.visit(cv);
			
		}
	}
}
