package polimorfimo.bebida.com;

public class Aplicacao {

	public static void main(String[] args) {
		LeiteQuente lei = new LeiteQuente();
		
		Refrigerante ref = new Refrigerante();
		
		Preparador preparar = new Preparador();
		//preparar.prepararBebida(lei);
		
		preparar.prepararBebida(ref);
		
		
		

	}

}
