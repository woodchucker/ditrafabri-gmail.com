package fabrizio;

public class Avvocato extends Persona{

	private String p_iva;
	
	public String getP_iva() {
		return p_iva;
	}

	public void setP_iva(String p_iva) {
		this.p_iva = p_iva;
	}
	
	public void obiezione() {
		System.out.println("obiezione!");
	}
	
	public String qualifica() {
		return "avvocato";
	}
	
	@Override
	public String toString() {		
		return super.toString()+ " piva: " + p_iva;
	}
	@Override
	public void parla() {
		System.out.println("Ciao sono un "+ qualifica());
	}

	public Avvocato() {}
	
	public Avvocato(String nome, String mail, String p_iva) {
 		super(nome,mail);
		this.p_iva = p_iva;
	}
}
