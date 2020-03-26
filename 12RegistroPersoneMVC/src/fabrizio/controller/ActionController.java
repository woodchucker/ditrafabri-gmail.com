package fabrizio.controller;

import fabrizio.message.Message;
import fabrizio.model.Registro;
import fabrizio.utils.Observable;
import fabrizio.utils.Observer;
import fabrizio.view.View;

public class ActionController implements Observer {

	private Registro registro;

	public ActionController(Registro registro) {
		super();
		this.registro = registro;
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	@Override
	public void update(Observable o) {
		Message message = ((View) o).getMessage();

		setMessage(
				new AddPersonaController(message, registro), 
				new RemPersonaController(message, registro), 
				new ListPersonaController(message, registro),
				new ExitController(message, registro),
				new DefaultController(message, registro));
	}
	
	public void setMessage(Controller... controllers) {
		registro.notifyObservers(new Registro(registro.isRichiestaUscita(), registro.getOutput()));
	}

}
