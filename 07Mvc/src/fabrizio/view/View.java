package fabrizio.view;

import java.util.Scanner;

import fabrizio.exception.NotAllowNumberException;
import fabrizio.message.AddMessage;
import fabrizio.message.DefaultMessage;
import fabrizio.message.ExitMessage;
import fabrizio.message.ListaPersoneMessage;
import fabrizio.message.Message;
import fabrizio.message.RemoveMessage;
import fabrizio.message.TrovaPersonaMessage;
import fabrizio.model.Persona;
import fabrizio.model.Registro;
import fabrizio.utilities.Observable;
import fabrizio.utilities.Observer;

// il controller è interessato ai cambiamenti della view
// la view è observable per il controller (il controller è observer)
// la view è interessata ai cambiamenti del model
// il model è Observable
public class View extends Observable implements Observer {

	private Message m;
	private String output;

	public void richiediInput() {
		System.out.println("Inserisci una scelta:");
		System.out.println("0 Esci");
		System.out.println("1 Aggiungi Persona");
		System.out.println("2 Rimuovi Persona");
		System.out.println("3 Mostra Lista");
		System.out.println("4 Cerca persona");
		Scanner s = new Scanner(System.in);
		int i=-1;
		try {
			 i = Integer.parseInt(s.nextLine());
			 if(i<0) throw new NotAllowNumberException();
		}catch(NumberFormatException e) {
			System.out.println("per favore inserire un numero ");		
		}catch(NotAllowNumberException | ArrayIndexOutOfBoundsException  e){
					 
			System.out.println("E' stata generata un'eccezione di tipo numero non consentito");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// esci,aggiungi p, rimuovi persona, mostra lista.
		switch (i) {
		case 0:
			setM(new ExitMessage());
			break;

		case 1:
			Persona p = inputPersona();
			setM(new AddMessage(p));
			break;

		case 2:
			Persona p2 = inputPersona();
			setM(new RemoveMessage(p2));
			break;

		case 3:
			setM(new ListaPersoneMessage());
			break;
		case 4:
			Persona p3 = inputMail();
			setM(new TrovaPersonaMessage(p3));
			break;
		default:
			setM( new DefaultMessage());			

		}

	}

	private Persona inputMail() {
		System.out.println("Inserisci l'email:");

		Scanner s = new Scanner(System.in);

		String mail = s.nextLine();
		return new Persona(null, mail);

	}

	public Persona inputPersona() {
		System.out.println("Inserisci il nome:");
		Scanner s = new Scanner(System.in);

		String name = s.nextLine();

		System.out.println("Inserisci l'email:");

		String mail = s.nextLine();
		return new Persona(name, mail);

	}

	public void mostraOutput() {
		System.out.println(this.getOutput());
	}

	public Message getM() {
		return m;
	}

	public void setM(Message m) {
		this.m = m;
		// Passiamo al controller la view contenente il messaggio
		notifyObservers(this);
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	@Override
	public void update(Observable o) {
		// La view deve ricevere un registro
		Registro r = ((Registro) o);
		setOutput(r.getOutput());
		System.out.println(r);
		mostraOutput();
	}

}
