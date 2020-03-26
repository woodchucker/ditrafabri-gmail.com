package fabrizio.controllers;

import fabrizio.message.Message;
import fabrizio.models.Registro;

public class AddController extends Controller{

	private Registro r;

	public AddController(Registro r) {
		super();
		this.r = r;
	}

	@Override
	public void doAction() {
		Message m = super.getV().getMessage();
		
	}
	

	
}
