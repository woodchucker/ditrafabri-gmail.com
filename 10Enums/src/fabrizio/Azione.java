package fabrizio;
/*
 * Ogni enum deve avere lo stesso metodo che mi fa la syso di una stringa diversa.
 * 
 * Fare un metodo esegui per ogni costante che nel caso di 
 * 	addP stampa 1,2,3 con un for
 * 	remP stampa 3,2,1 con un for
 *  showPs stampa 0.
 */

public enum Azione {

	ADD_PERSON("Aggiungi persona") {
		public void esegui() {
			System.out.println("1");
		}
	},
	REM_PERSON("Rimuovi persona") {
		public void esegui() {
			System.out.println("2");
		}
	},
	SHOW_PERSONS("Mostra persone") {
		
		public void esegui() {
			System.out.println("3");
		}
		
	},
	NO_ACTION
	;

	// fields
	private String nome;

	Azione() {
	}

	Azione(String nome) {
		this.nome = nome;
	}

	// methods
	
	// creo il puntatore
	// metodo in comune se non viene fatto l'override
	public void esegui() {
		System.out.println("-1");
	}
	// obbligo ogni singolo enum a fare l'override di questa metodo
	//public abstract void esegui() ;
		
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void printNome() {
		System.out.println(nome);
	}

}
