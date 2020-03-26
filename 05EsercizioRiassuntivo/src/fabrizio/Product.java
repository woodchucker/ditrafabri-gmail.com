package fabrizio;

public class Product extends Observable{

	private String marca;
	private String colore;
	private boolean avaiable;
	@Override
	public String toString() {
		return "Product [marca=" + marca + ", colore=" + colore + ", avaiable=" + avaiable + "]";
	}
	public Product(String marca, String colore, boolean avaiable) {
		super();
		this.marca = marca;
		this.colore = colore;
		this.avaiable = false;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
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
