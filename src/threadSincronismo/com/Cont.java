package threadSincronismo.com;

public class Cont {
	
	private int valor;
	// aqui a regi�o critica aonde � feito o calculo e � atribuido ao atributo valor. 
	// usando synchronized garante que uma thread por vez acesse o metodo. enquanto as outras threads aguarda o escalonador. 
	//
	public synchronized void incrementar() {
		valor++;
	}
	
	public int getValor() {
		return valor;
	}
}
