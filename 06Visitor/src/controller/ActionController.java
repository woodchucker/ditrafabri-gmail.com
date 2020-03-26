package controller;

import main.User;
import message.Message;
import utilities.Observable;
import utilities.Observer;

public class ActionController implements Observer{

	public void setMessage(Message message){
		
		message.visit(new HelloController(), new ExitController(), new DefaultController());
	}

	@Override
	public void update(Observable obs) {
		setMessage( ((User)obs).getLastMessage() );
		
	}

}
