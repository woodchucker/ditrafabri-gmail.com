package fabrizio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Sciarpa sc1 = new Sciarpa("m1", "rosso", false);
		Sciarpa sc2 = new Sciarpa("m2", "nero", false);
		Scarpa s1 = new Scarpa("m1", "rosso", false);
		Scarpa s2 = new Scarpa("m2", "nero", false);
		Pantalone pa1 = new Pantalone("m1", "rosso", false);
		Pantalone pa2 = new Pantalone("m2", "nero", false);
		Sciarpa sc3 = new Sciarpa("m3", "giallo", false);
		
		Utente u = new Utente("bob");
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.addAll(Arrays.asList(sc1, sc2, sc3, s1, s2, pa1, pa2));
		
		while(!products.isEmpty()) {
		shuffleProductsAvaiability(products);
		printList(products);
		selectProducts(products,u);	
		}
		
	}
	
	
	public static void shuffleProductsAvaiability(ArrayList<Product> products) {
		Random r = new Random();
		for (Product p : products) {
			p.setAvaiable(r.nextBoolean());
		}
	}
	
	public static void printList(ArrayList<Product> products) {
		
		for (int i=0; i<products.size();i++) {
			System.out.println(i+ " " + products.get(i));
		}
	}
	
	public static void selectProducts(ArrayList<Product> products, Utente u) {
		
		System.out.println("Inserisci il numero per scegliere un prodotto:");
		Scanner scan = new Scanner(System.in);
		int scelta = Integer.parseInt(scan.nextLine());
		try {
			Product p = products.get(scelta);
			if (p.isAvaiable()) {
				products.remove(p);
			}else{
				p.subscribe(u);
			}
			
		}catch(Exception e){
			
		}
	}
	
	

}
