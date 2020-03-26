package fabrizio;

public class Utente implements Observer{

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(Observable obs) {
		System.out.println("Caro utente "+ nome +" la scarpa"+ ((Scarpa) obs).getMarca() + " è di nuovo disponibile");		
	}

	public Utente(String nome) {
		super();
		this.nome = nome;
	}
	
	
}
