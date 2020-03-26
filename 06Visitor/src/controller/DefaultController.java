package controller;

public class DefaultController implements ControllerVisitor{

	@Override
	public void visitHelloMessage() {
		
		
	}

	@Override
	public void visitExitMessage() {
		
		
	}

	@Override
	public void visitDefaultMessage() {
		System.out.println("Messaggio non valido!");
		
	}

}
