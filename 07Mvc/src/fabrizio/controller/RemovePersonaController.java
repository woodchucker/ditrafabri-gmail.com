package fabrizio.controller;

import fabrizio.model.Persona;
import fabrizio.model.Registro;

public class RemovePersonaController implements ControllerVisitor {

	private Persona p;
	public RemovePersonaController(Persona p, Registro r) {
		super();
		this.p = p;
		this.r = r;
	}

	private Registro r;
	
	@Override
	public void visitAddPersonaController() {
		

	}

	@Override
	public void visitRemovePersonaController() {
		
		r.removePerson(p);

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
		
		
	}

}
