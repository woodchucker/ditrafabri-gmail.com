/**
 * Oracolo
 * Oggetto che ha una lista di stringhe
 * Stringhe che sono le risposte e sono 7
 * Utente può fare domande all'oracolo
 * Oracolo restituisce all'utente una risposta random
 * l'utente non si aspetta di ricevere due volte la stessa Risposta quindi 
 * una volta data viene rimossa
 * Quando l'oracolo non ha più risposte, il programma termina con messaggio risposte terminate.
 * L'utente può decidere di terminare il programma in qualsiasi momento.
 * 
 * ********************
 * Il flusso gestito dal main si sviluppa nel seguente modo:
 *  - 1. nella view si fa una domanda
 *  - 2. il controller verrà notificato della domanda in base alla domanda ha tre opzioni: randomResponse, exit, addInDict
 *  - 3. 
 * 
 * ********************************************************
 * 
 * Task2
 * L'oracolo nel momento in cui riceva una domanda già posta, 
 * deve dare all'utente la stessa risposta
 */

package fabrizio;

import fabrizio.controller.Controller;
import fabrizio.model.Oracolo;
import fabrizio.utilities.reflection.ReflectionUtils;
import fabrizio.view.View;

public class Main {
	// se setto reflection true disabilito l'oracolo e provo ad usare la Reflection
	
	//*
	public static boolean reflection = true;
	/*/
	public static boolean reflection = false;
	//*/
	
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// Oracolo con lista delle risposte

		if (!reflection) {
			runOracolo();
		} else {

			String className = "fabrizio.model.Oracolo";

			System.out.println("I field della Classe sono");
			for (String field : ReflectionUtils.getStringFields(Class.forName(className).newInstance())) {

				System.out.println(field);
			}
		}

	}

	public static void runOracolo() {
		Oracolo model = new Oracolo();
		View view = new View();
		Controller controller = new Controller(model);

		
		
		controller.setOracolo(model);
		view.subscribe(controller);
		model.subscribe(view);

		while (true) {
			view.richiediInput();

		}
	}

}
