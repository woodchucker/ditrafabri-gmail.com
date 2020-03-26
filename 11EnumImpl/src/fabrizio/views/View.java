package fabrizio.views;

import java.util.Scanner;

import fabrizio.enums.Action;
import fabrizio.message.Message;
import fabrizio.utilities.Observable;

public class View extends Observable{
	
	private Message message;
	

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
		notifyObservers(this);
	}

	public void richiediInput() {
		printOptions();
		Scanner s = new Scanner(System.in); 
		int i = Integer.parseInt(s.nextLine());
		//TODO
		for(Action a: Action.values()) {
			if(i == a.getOption()) {
				Message m = a.doAction();
				this.setMessage(m);
			}
		}
		
		
		
	}
	

	
	public void printOptions() {
		System.out.println("Scegli un'azione: ");
		
		for (Action a: Action.values()) {
			System.out.println(a.getOption() + " " + a.getLabel());
		}

	}

	
}
