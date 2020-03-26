package fabrizio.view;

import java.util.Scanner;

import fabrizio.constants.Azione;
import fabrizio.message.Message;
import fabrizio.model.Registro;
import fabrizio.utils.Observable;
import fabrizio.utils.Observer;

public class View extends Observable implements Observer{

	private Message message;
	private Registro registro; //read only copy

	public void richiediInput() {

		mostraMenu();
		inserisciAzione();

	}

	private void inserisciAzione() {
		Scanner s = new Scanner(System.in);

		
		int n = -1;
		try{
			n = Integer.parseInt(s.nextLine());
		}catch (NumberFormatException e) {
			
		}
		

		for (Azione a : Azione.values()) {
			if (a.getNumber() == n) {
				Message m = a.eseguiAzione();
				setMessage(m);
				return;
			}
		}
		
		setMessage(Azione.DEFAULT.eseguiAzione());

	}

	private void mostraMenu() {
		System.out.println("Seleziona azione:");
		for (Azione a : Azione.values()) {
			if(a != Azione.DEFAULT)
			System.out.println(a.getNumber() + "] " + a.getDescrizione());
		}
	}

	public void mostraOutput() {
		System.out.println(registro.getOutput());
		if(registro.isRichiestaUscita()) System.exit(0);
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
		notifyObservers(this);
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	@Override
	public void update(Observable o) {
		setRegistro((Registro)o);
	}

}
