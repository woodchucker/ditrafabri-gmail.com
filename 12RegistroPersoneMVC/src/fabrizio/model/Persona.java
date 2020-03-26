package fabrizio.model;

public class Persona {
	
	private String name;
	private String mail;
	@Override
	public String toString() {
		return "Persona [name=" + name + ", mail=" + mail + "]";
	}
	public Persona(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
