package fabrizio.controller;

import fabrizio.constants.Azione;
import fabrizio.message.Message;
import fabrizio.model.Persona;
import fabrizio.model.Registro;

public class ListPersonaController extends Controller {

	public final Azione AZIONE = Azione.LIST_PERSONA;
	
	public ListPersonaController(Message message, Registro registro) {
		super(message);
		if(AZIONE == message.getAzione()) {
			String out = "";
			
			for(Persona p: registro.getPersone()) {
				out += p.toString() + "\n";
			}
			
			registro.setOutput(out);
		}
	}

}
