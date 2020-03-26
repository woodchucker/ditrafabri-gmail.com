package fabrizio;

public class Persona {

	private int eta;
	private String name;
	
	@Override
	public String toString() {
		return "Persona [eta=" + eta + ", name=" + name + "]";
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
