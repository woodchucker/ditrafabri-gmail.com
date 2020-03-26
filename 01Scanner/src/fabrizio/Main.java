package fabrizio;

import java.util.Scanner;

/**
 * 
 * @author Fabrizio-W10 Oggetto java SE library che resta in attesa di input da
 *         terminale per poi riprendere l'esecuzione Perchè File, anche in C il
 *         terminale poteva accettare input utente, il terminale è letto come un
 *         file di testo
 */
public class Main {

	public static void main(String[] args) {
		int count = 0;
		boolean run = true;
		Persona[] persone = new Persona[2];
		personsPrintList(new Persona(), new Persona(), new Persona());
		while (run) {
			printMenu();
			int scelta = richiediScelta();
			count += eseguiScelte(scelta, persone, count);
		}
		
		
	}

	private static int eseguiScelte(int scelta, Persona[] persone, int count) {

		switch (scelta) {
		case 0:
			System.out.println("Scelta non valida");
			break;
		case 1:
			addPerson(persone, count);
			return 1;
		case 2:
			personsPrintList(persone);
			break;
		case 3:
			System.exit(0);
			break;

		}
		return 0;

	}

	private static int richiediScelta() {
		Scanner s = new Scanner(System.in);
		int retVal = Integer.parseInt(s.nextLine());
		if (retVal <= 3 && retVal > 0) {
			return retVal;
		}
		return 0;

	}

	public static void addPerson(Persona[] persone, int count) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci un nome");
		persone[count] = new Persona();
		persone[count].setName(s.nextLine());
		System.out.println("inserisci età");
		persone[count].setEta(Integer.parseInt(s.nextLine()));
	}

	// Operatore ellipsis ... Accetta un insieme di oggetti da un metodo
	// posso passare un array di elementi, o una serie di oggetti separati da virgole  oppure
	// passare una sola persona lo posso fare se invece avevo le []
	// dovevo fare l'array persone con unica persona e poi mandarla in argomento al personsPrintList
	public static void personsPrintList(Persona... persone) {

		for (Persona p: persone) {

			if (p != null) {
				System.out.println(p);
			}
		}
	}

	public static void printMenu() {
		System.out.println("[1] Aggiungi una persona");
		System.out.println("[2] Visualizza lista persone");
		System.out.println("[3] Esci");
	}

	/*
	 * Scanner s = new Scanner(System.in); System.out.println("Inserisci un nome");
	 * // nextLine restituisce sempre una stringa String name = s.nextLine(); // gli
	 * altri metodi non è detto che chiudono lo stream
	 * 
	 * System.out.println("inserisci età");
	 * 
	 * int eta = Integer.parseInt(s.nextLine());
	 * 
	 * System.out.println(name + " " + eta);
	 */

}
