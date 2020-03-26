package fabrizio;

public abstract class Figura {

	private String name;
	
	// il puntatore che instanzia questo metodo punta a null
	// si può fare l'override direttamente nel main quando si instanzia
	public abstract int getArea();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Figura [name=" + name + "]";
	}

	public Figura(String name) {
		super();
		this.name = name;
	}
	
}
