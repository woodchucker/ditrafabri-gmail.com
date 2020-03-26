package fabrizio.controller;


public interface ControllerVisitor {

	public void visitAddPersonaController();
	public void visitRemovePersonaController();
	public void visitListaPersoneController();
	public void visitExitController();
	public void visitTrovaPersonaController();
	public void visitDefaultController();
}
