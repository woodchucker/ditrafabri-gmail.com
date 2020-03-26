package controller;

public interface ControllerVisitor {

	public void visitHelloMessage();
	public void visitExitMessage();
	public void visitDefaultMessage();
}
