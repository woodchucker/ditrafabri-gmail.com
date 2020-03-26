package fabrizio.model;

import java.util.HashSet;

import fabrizio.utilities.Observable;

public class Registro extends Observable{

	private HashSet<Persona> persone = new HashSet<Persona>();
	private String output;

	public Registro(String output) {
		this.output = output;
	}

	public Registro() {}

	public void addPerson(Persona p) {
		persone.add(p);
		setOutput("Aggiunta persona correttamente " + p.toString());
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
		notifyObservers(new Registro(output));
	}

	public void removePerson(Persona p) {
		// bisogna tenere conto della funzione di hash
		boolean rimossa = persone.remove(p);
		/*
		 * if(rimossa) { setOutput("Persona rimossa correttamente dal registro" +
		 * p.toString()); }else { setOutput("La persona da rimuovere non esiste!"); }
		 */
		setOutput((rimossa) ? "Persona rimossa correttamente dal registro" + p.toString()
				: "La persona da rimuovere non esiste!");

	}

	public void getListaPersone() {
		setOutput(this.toString());
	}

	public String toString() {
		String listaPersone = "";
		for (Persona p : persone) {
			listaPersone += p.toString() + "\n";
		}
		return listaPersone;
	}

	public void findByMail(String mail) {
		
		for(Persona p: persone) {
			if( p.getMail().equals(mail) ) {
				setOutput("La persona cercata è " + p.toString());
				return;
			}
		}
		
		setOutput ("La persona cercata non esiste!");
		
	}

	public void showDefaultOutput() {
		setOutput("Selezione non valida");
		
	}

}