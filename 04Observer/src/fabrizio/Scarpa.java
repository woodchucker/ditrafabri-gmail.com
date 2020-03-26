package fabrizio;

public class Scarpa extends Observable{

	private boolean avaiable;
	private String marca;

	public Scarpa(boolean avaiable, String marca) {
		super();
		this.avaiable = avaiable;
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isAvaiable() {
		return avaiable;
	}

	public void setAvaiable(boolean avaiable) {
		if(avaiable) {
			notifyObservers(this);
		}
		this.avaiable = avaiable;
	}
}
