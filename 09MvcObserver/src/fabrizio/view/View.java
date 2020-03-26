package fabrizio.view;

import java.util.Scanner;

import fabrizio.model.Oracolo;
import fabrizio.utilities.Observable;
import fabrizio.utilities.Observer;

public class View extends Observable implements Observer {

	private String output;
	private String input;
	
	public void richiediInput() {
		System.out.println("Fai una domanda all'Oracolo");
		Scanner s = new Scanner(System.in);
		String domanda = s.nextLine();
		setInput(domanda);
	
	}
	
	
	public void mostraOutput() {
		System.out.println(this.getOutput());
	}
	
	@Override
	public void update(Observable o) {
		// La view deve ricevere una risposta dall'oracolo
		Oracolo or = ((Oracolo) o);
		setOutput(or.getOutput());
		mostraOutput();
		System.out.println(or.getSize());
		if(or.getSize() == 0) {
			System.out.println(or.getArrivederci());
			System.exit(0);
		}
	}
	
	public String getInput() {
		return input;
	}


	public void setInput(String input) {
		this.input = input;
		notifyObservers(this);
	}



	
	public String getOutput() {
		return output;
	}
	
	public void setOutput(String output) {
		this.output = output;
	}
	
}
