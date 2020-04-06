package interfaces2.com;

public class Porta implements Cloneable {
	
	double altura;
	double largura;
	boolean aberta;
	
	
	
	public Porta(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
		
		this.aberta = false;
	}

	public void abrir() {
		this.aberta = true;
	}
	
	public void fecher() {
		this.aberta = false;
	}
	
	@Override
	public Object clone(){
		Porta porta = new Porta(this.altura, this.largura);
		porta.aberta = this.aberta;
		return porta;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	
}
