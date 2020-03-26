package fabrizio;

public class Sciarpa extends Product{

	public Sciarpa(String marca, String colore, boolean avaiable) {
		super(marca, colore, avaiable);
		
	}

	@Override
	public String toString() {
		
		return "Sciarpa " + super.toString();
	}

}
