package fabrizio.enums;

import java.util.Scanner;

import fabrizio.message.Message;
import fabrizio.models.Persona;

public enum Action {

	ADD_P(1, "Aggiungi persona") {
		@Override
		public Message doAction() {

			System.out.println("Inserisci il nome: ");
			Scanner s = new Scanner(System.in);
			String nome = s.nextLine();
			System.out.println("Inserisci l'email: ");
			
			String mail = s.nextLine();

			Persona p = new Persona(nome, mail);
			Message m = new Message();
			m.setPersona(p);
			return m;
		}
	},
	REM_P(2, "Rimuovi persona") {
		@Override
		public Message doAction() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	SHOW_PS(3, "Mostra elenco") {
		@Override
		public Message doAction() {
			// TODO Auto-generated method stub
			return null;
		}
	};

	private int option;
	private String label;

	public abstract Message doAction();

	private Action(int option, String label) {
		this.option = option;
		this.label = label;
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
