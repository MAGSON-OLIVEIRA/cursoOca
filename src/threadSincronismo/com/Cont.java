package threadSincronismo.com;

public class Cont {
	
	private int valor;
	// aqui a região critica aonde é feito o calculo e é atribuido ao atributo valor. 
	// usando synchronized garante que uma thread por vez acesse o metodo. enquanto as outras threads aguarda o escalonador. 
	//
	public synchronized void incrementar() {
		valor++;
	}
	
	public int getValor() {
		return valor;
	}
}
