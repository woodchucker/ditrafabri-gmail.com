package fabrizio.controller;

import fabrizio.constants.Azione;
import fabrizio.message.Message;
import fabrizio.model.Registro;

public class ExitController extends Controller {
	
	public final Azione AZIONE = Azione.EXIT;

	public ExitController(Message message, Registro registro) {
		super(message);
		if(AZIONE == message.getAzione()) {
			registro.setRichiestaUscita(true);
			registro.setOutput("Arrivederci.");
		}
	}

}
