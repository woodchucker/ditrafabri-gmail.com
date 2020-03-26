package fabrizio.controller;

import fabrizio.model.Registro;

public class ListaPersoneController implements ControllerVisitor {

	private Registro r;
	
	public ListaPersoneController(Registro r) {
		super();
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
		// Prende il registro
		r.getListaPersone();

	}

	@Override
	public void visitExitController() {
		

	}

	@Override
	public void visitTrovaPersonaController() {
		
		
	}

	@Override
	public void visitDefaultController() {
		
	}

}
