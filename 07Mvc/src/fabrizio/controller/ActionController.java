package fabrizio.controller;

import fabrizio.message.Message;
import fabrizio.model.Registro;
import fabrizio.utilities.Observable;
import fabrizio.utilities.Observer;
import fabrizio.view.View;

public class ActionController implements Observer{

	private Registro registro;
	public void setMessage(Message m) {
		m.visit(
				new AddPersonaController(m.getPersona(), registro),
				new RemovePersonaController(m.getPersona(), registro),
				new ListaPersoneController(registro),
				new TrovaPersonaController(m.getPersona(), registro),
				new DefaultController(registro),
				new ExitController()
		);
	}
	@Override
	public void update(Observable o) {
		// ac viene aggiornato dalla view con il messaggio settato dalla view
		Message m = ((View) o).getM();
		setMessage(m);
	}
	public void setRegistro(Registro model) {
		this.registro = model;
		
	};
}
