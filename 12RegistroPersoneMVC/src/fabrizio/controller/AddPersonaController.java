package fabrizio.controller;

import fabrizio.constants.Azione;
import fabrizio.message.Message;
import fabrizio.model.Registro;

public class AddPersonaController extends Controller {

	public final Azione AZIONE = Azione.ADD_PERSONA;

	public AddPersonaController(Message message, Registro registro) {
		super(message);
		if (AZIONE == message.getAzione()) {
			registro.addPersona(message.getPersona());
			registro.setOutput("persona " + message.getPersona() + " aggiunta correttamente!");

		}
	}

}
