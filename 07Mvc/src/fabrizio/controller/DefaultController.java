package fabrizio.controller;


import fabrizio.model.Registro;

public class DefaultController implements ControllerVisitor{

	
	Registro r;
	
	public DefaultController( Registro r) {
		this.r = r;
	}
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
		
		
	}

	@Override
	public void visitTrovaPersonaController() {
		
		
	}

	@Override
	public void visitDefaultController() {
		
		r.showDefaultOutput();
	}

}
