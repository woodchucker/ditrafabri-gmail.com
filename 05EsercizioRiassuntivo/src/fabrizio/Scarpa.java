package fabrizio;

public class Scarpa extends Product{

	public Scarpa(String marca, String colore, Boolean avaiable) {
		super(marca, colore, avaiable);
		
	}

	@Override
	public String toString() {
		
		return "Scarpa " + super.toString();
	}
	
}
