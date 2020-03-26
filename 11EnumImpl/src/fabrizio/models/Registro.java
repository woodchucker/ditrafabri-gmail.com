package fabrizio.models;

import java.util.ArrayList;

public class Registro {

	private ArrayList<Persona> persone = new ArrayList<Persona>();
	
	public void addPerson(String nome, String mail) {
		
		persone.add(new Persona(nome, mail));
		System.out.println(persone.get(0).toString());
	}
	
	public void remPerson(Persona p) {
		persone.remove(p);
	}
	
	public String stringList() {
		String list = "";
		for (Persona p: persone) {
			list += p.toString();
		}
		return list;
	}
}
