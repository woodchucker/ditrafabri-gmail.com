package controller;

public class HelloController implements ControllerVisitor{

	
	@Override
	public void visitDefaultMessage() {
			
	}

	public void hello() {
		System.out.println("Hello!");
	}
	
	@Override
	public void visitHelloMessage() {
		hello();
		
	}

	@Override
	public void visitExitMessage() {}

}
