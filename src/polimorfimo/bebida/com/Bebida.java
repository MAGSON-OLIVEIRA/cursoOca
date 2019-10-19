package polimorfimo.bebida.com;

public class Bebida {
	private String nome;
	private boolean aquecida;
	
	public Bebida(String nome, boolean aquecida) {
		this.nome = nome;
		this.aquecida = aquecida;
	}
	
	public String getNome() {
		return nome;
	}
	
	public boolean isAquecida() {
		return aquecida;
	}
	
	public void preparar() {
	}
	
	

}
