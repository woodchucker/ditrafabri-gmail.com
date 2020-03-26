package fabrizio;

public class Main {

	public static void main(String[] args) {
		
		Scarpa s1 = new Scarpa(true,"m1");
		Scarpa s2 = new Scarpa(true,"m2");
		Utente u1 = new Utente("u1");
		Utente u2 = new Utente("u2");
		Utente u3 = new Utente("u3");
		s1.subscribe(u1);
		s1.subscribe(u3);
		s2.subscribe(u2);
		s1.setAvaiable(true);
		// Rimuove il trigger
		//s.unsubscribe(u);
		
		s2.setAvaiable(true);
		// Observable è una classe concreta ma in alcuni casi non si vuole usare come protagonista 
		// perchè si conosco solo i metodi per utilizzarlo quando l'osservabile è una classe abstract
		// Observable o = new Scarpa();
		Observable o = s1;
		
		// 3 scarpe tre utenti
		// solo gli ut interessati dicono scarpa x per utente y
		// aggiungere il controllo sul tipo di scarpa
		
		

	}

}
