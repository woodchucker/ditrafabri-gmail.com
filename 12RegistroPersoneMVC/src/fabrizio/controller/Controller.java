package fabrizio.controller;

import fabrizio.message.Message;

public class Controller {
	
	private Message message;

	public Controller(Message message) {
		super();
		this.setMessage(message);
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	

}
