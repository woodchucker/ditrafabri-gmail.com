package fabrizio.constants;

import java.util.Scanner;

import fabrizio.message.Message;
import fabrizio.model.Persona;

public enum Azione {

	ADD_PERSONA(1, "Aggiungi persona") {
		@Override
		public Message eseguiAzione() {
			System.out.println("Inserisci nome:");
			Scanner s = new Scanner(System.in);
			String nome = s.nextLine();
			System.out.println("inserisci mail:");
			String mail = s.nextLine();
			Persona p = new Persona(nome, mail);
			Message m = new Message(p, this);
			return m;
		}
	},
	REM_PERSONA(2, "Rimuovi persona") {
		@Override
		public Message eseguiAzione() {
			System.out.println("inserisci mail:");
			Scanner s = new Scanner(System.in);
			String mail = s.nextLine();
			Persona p = new Persona(null, mail);
			Message m = new Message(p, this);
			return m;
		}
	},
	LIST_PERSONA(3, "Lista persone") {
		@Override
		public Message eseguiAzione() {
			return new Message(null, this);
		}
	},
	EXIT(0, "Esci") {
		@Override
		public Message eseguiAzione() {
			return new Message(null, this);
		}
	}, DEFAULT(-1, "") {
		@Override
		public Message eseguiAzione() {
			return new Message(null, this);
		}
	};

	private int number;
	private String descrizione;

	Azione(int number, String desc) {

		this.number = number;
		this.descrizione = desc;

	}

	public int getNumber() {
		return number;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public abstract Message eseguiAzione();

}
