package fabrizio.message;

import fabrizio.constants.Azione;
import fabrizio.model.Persona;

public class Message {
	
	private Persona persona;
	private Azione azione;

	public Message(Persona persona, Azione azione) {
		this.persona = persona;
		this.azione = azione;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Azione getAzione() {
		return azione;
	}

	public void setAzione(Azione azione) {
		this.azione = azione;
	}

}
