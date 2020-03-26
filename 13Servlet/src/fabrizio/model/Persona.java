package fabrizio.model;

public class Persona {

	private int id;
	private String nome;
	private String mail;
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
	public Persona(int id, String nome, String mail) {
		super();
		this.id = id;
		this.nome = nome;
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", mail=" + mail + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
