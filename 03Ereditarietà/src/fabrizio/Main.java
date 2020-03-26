package fabrizio;

public class Main {

	public static void main(String[] args) {
		
		Avvocato ugo = new Avvocato("Ugo", "ugo@mail.com", "234325");
		Persona p = new Persona("bob","bob@mail.com");
		Persona[] persone = new Persona[2];
		persone[0] = p;
		//DownCast implicito si può sempre fare comporta una riduzione di memoria
		persone[1] = ugo;

		for(Persona pe: persone ) {
			pe.parla();
			// Dynamic binding viene chiamato il metodo qualifica della classe di prima instanza
			System.out.println(pe);
		}
		
		Avvocato[] avvocati = new Avvocato[2];
		avvocati[0] = ugo;
		//avvocati[1] = (Avvocato) p;
		// L'oggetto p non ha abbastanza spazio per ospitare i metodi di avvocato
		// per aggiungere una persona come fosse avvocato si deve reinstanziare un oggetto Avvocato
		// per riallocare la memoria
		avvocati[1] = new Avvocato(p.getNome(), p.getMail(), null);
		for (Avvocato av: avvocati) {
			av.parla();
			System.out.println(av);
		}
		
		/*
		 *  Output:
		 * 	Ciao sono una persona
			Persona: nome=bob, mail=bob@mail.com
			Ciao sono un avvocato
			Persona: nome=Ugo, mail=ugo@mail.com piva: 234325
		 */
	}

}
