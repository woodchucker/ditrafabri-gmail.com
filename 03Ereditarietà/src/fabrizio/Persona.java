package fabrizio;

public class Persona {

	private String nome;
	private String mail;
	
	public Persona() {}
	
	public Persona(String nome, String mail) {
		
		this.nome = nome;
		this.mail = mail;
	}
	
	public void parla() {
		System.out.println("Ciao sono una "+ qualifica());
	}
	public String qualifica() {
		return "persona";
	}
	@Override
	public String toString() {
		return "Persona: nome=" + nome + ", mail=" + mail;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
