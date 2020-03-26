package main;

import java.util.Scanner;

import message.DefaultMessage;
import message.ExitMessage;
import message.HelloMessage;
import message.Message;
import utilities.Observable;

public class User extends Observable{

	private String name;
	private Message lastMessage;

	public void eseguiAzione() {
		System.out.println("Seleziona un azione: 1 Hello, 0 Exit");
		Scanner s = new Scanner(System.in);
		int i = Integer.parseInt(s.nextLine());
		switch (i) {
		case 0:
			setLastMessage(new ExitMessage());
			break;
		case 1:
			setLastMessage(new HelloMessage());
			break;
		default:
			setLastMessage(new DefaultMessage());
			break;
		}
		
	}

	public Message getLastMessage() {
		return lastMessage;
	}

	public void setLastMessage(Message lastMessage) {
		this.lastMessage = lastMessage;
		emit(this);
	}
}
