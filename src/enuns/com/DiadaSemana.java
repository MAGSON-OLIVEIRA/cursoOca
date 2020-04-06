package enuns.com;

public enum DiadaSemana {
	
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	private int in;
	
	DiadaSemana(int in){
		this.in = in;
	}
	
	public int getIn() {
		return in;
	}
	

}
