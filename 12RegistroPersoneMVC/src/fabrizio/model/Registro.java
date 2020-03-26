package fabrizio.model;

import java.util.ArrayList;

import fabrizio.utils.Observable;

public class Registro extends Observable{
	
	private boolean richiestaUscita = false;
	
	public Registro() {}
	public Registro(boolean richiestaUscita, String output) {
		super();
		this.richiestaUscita = richiestaUscita;
		this.output = output;
	}

	private ArrayList<Persona> persone = new ArrayList<Persona>();
	private String output;
	
	
	public ArrayList<Persona> getPersone() {
		return persone;
	}

	public void setPersone(ArrayList<Persona> persone) {
		this.persone = persone;
	}

	public void addPersona(Persona p) {
		persone.add(p);
	}
	
	public void removePersona(Persona p) {
		persone.remove(p);
	}

	public String getOutput() {
		return output;		
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public Registro(String output) {
		super();
		this.output = output;
	}

	public boolean isRichiestaUscita() {
		return richiestaUscita;
	}

	public void setRichiestaUscita(boolean richiestaUscita) {
		this.richiestaUscita = richiestaUscita;
	}

}
