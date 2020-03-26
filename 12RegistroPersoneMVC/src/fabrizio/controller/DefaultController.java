package fabrizio.controller;

import fabrizio.constants.Azione;
import fabrizio.message.Message;
import fabrizio.model.Registro;

public class DefaultController extends Controller {
	
	public final Azione AZIONE = Azione.DEFAULT;

	public DefaultController(Message message, Registro registro) {
		super(message);
		if(message.getAzione() == AZIONE) registro.setOutput("Selezione non valida...");
	}

}
