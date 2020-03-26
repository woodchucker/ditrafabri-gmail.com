package fabrizio.controller;

import fabrizio.model.Oracolo;
import fabrizio.utilities.Observable;
import fabrizio.utilities.Observer;
import fabrizio.view.View;

public class Controller implements Observer{

	private Oracolo oracolo;

	@Override
	public void update(Observable o) {
		
		String d = ((View) o).getInput();
		if (d.equals("exit")) {
			System.exit(0);
		}else {
			
			oracolo.getRandomResponse(d);
			//oracolo.addInDict(d);
		}
			
	}
	
	public Oracolo getOracolo() {
		return oracolo;
	}

	public void setOracolo(Oracolo oracolo) {
		this.oracolo = oracolo;
	}

	public Controller(Oracolo oracolo) {
		super();
		this.oracolo = oracolo;
	}
	
//	public void getResponse() {
//		oracolo.getRandomResponse();
//	}


}
