package main;

import controller.ActionController;

public class Main {

	public static void main(String[] args) {
		
		User u = new User();
		ActionController ac = new ActionController();
		u.subscribe(ac);
		while(true) {
			//ac.setMessage(u.eseguiAzione());
			u.eseguiAzione();
			
		}
	}

}
