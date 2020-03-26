package fabrizio;

public class Pantalone extends Product{

	public Pantalone(String marca, String colore, Boolean avaiable) {
		super(marca, colore, avaiable);
		
	}
	@Override
	public String toString() {
		
		return "Pantalone " + super.toString();
	}
}
