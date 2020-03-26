package fabrizio.controller;

import fabrizio.constants.Azione;
import fabrizio.message.Message;
import fabrizio.model.Persona;
import fabrizio.model.Registro;

public class RemPersonaController extends Controller {

	public final Azione AZIONE = Azione.REM_PERSONA;

	public RemPersonaController(Message message, Registro registro) {
		super(message);
		if (AZIONE == message.getAzione()) {
			String mail = message.getPersona().getMail();
			for (Persona p : registro.getPersone()) {
				if (p.getMail().equals(mail)) {
					registro.removePersona(p);
					registro.setOutput("persona " + p + " rimossa correttamente!");
					return;
				}
			}
			registro.setOutput("persona non trovata");
		}

	}

}
