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
	  
	 // Ao sobrescrever um método, a assinatura do novo método deve
	  //permanecer a mesma (tipo de retorno, nome do método e parâmetros).
	  //Métodos privados não podem ser sobrescritos, uma vez que a subclasse
	  //não possui acesso a eles. Métodos estáticos também não podem ser sobrescritos 
	  //porque eles pertencem à classe, e não a um objeto específico.
}
