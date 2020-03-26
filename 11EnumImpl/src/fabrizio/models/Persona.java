package fabrizio.models;

public class Persona {
	String nome;
	String email;
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", email=" + email + "]";
	}
	public Persona(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
