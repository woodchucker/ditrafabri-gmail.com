package fabrizio.controller;

public class ExitController implements ControllerVisitor {

	@Override
	public void visitAddPersonaController() {
		
	}

	@Override
	public void visitRemovePersonaController() {
		
	}

	@Override
	public void visitListaPersoneController() {
		
	}

	@Override
	public void visitExitController() {
		System.exit(0);

	}

	@Override
	public void visitTrovaPersonaController() {
	
		
	}

	@Override
	public void visitDefaultController() {
		
		
	}

}
