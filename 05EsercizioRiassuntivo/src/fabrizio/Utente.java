package fabrizio;

public class Utente implements Observer {

	private String nome;

	@Override
	public String toString() {
		return "Utente [nome=" + nome + "]";
	}

	public Utente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(Observable obs) {
		
		System.out.println("Il prodotto " + obs + " � di nuovo disponibile");
	}
}
