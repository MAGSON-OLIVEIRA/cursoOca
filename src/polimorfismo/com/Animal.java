package polimorfismo.com;

public class Animal {
	int ok = 10;
	void nomeDoSomDosAnimais(){
		System.out.println("Vozes e ruidos");
	}
	
	public static void testeMalandro() {
		
	}
	
	  public Animal(int numPatas) {
		      System.out.println("ANIMALasdfasd: " + numPatas);		  
	   }
	  
	  private void testePrivate() {
		  
	  }
	  
	 // Ao sobrescrever um m�todo, a assinatura do novo m�todo deve
	  //permanecer a mesma (tipo de retorno, nome do m�todo e par�metros).
	  //M�todos privados n�o podem ser sobrescritos, uma vez que a subclasse
	  //n�o possui acesso a eles. M�todos est�ticos tamb�m n�o podem ser sobrescritos 
	  //porque eles pertencem � classe, e n�o a um objeto espec�fico.
}
