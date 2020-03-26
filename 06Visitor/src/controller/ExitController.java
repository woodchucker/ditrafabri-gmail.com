package controller;

public class ExitController implements ControllerVisitor {

	@Override
	public void visitDefaultMessage() {
			
	}

	@Override
	public void visitHelloMessage() {}

	@Override
	public void visitExitMessage() {
		exit();
	}

	public void exit(){
		System.out.println("Exit");
		System.exit(0);
	}
}
