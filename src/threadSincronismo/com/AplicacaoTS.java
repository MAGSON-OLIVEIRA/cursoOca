package threadSincronismo.com;

public class AplicacaoTS {

	public static void main(String[] args) {
		//  Processos MyApp
		// linha de execução dento de um processo. THREADS. 
		// Mais de uma linha de execurção Mult THREADS
		
//		ClasseTeste2 t2 = new ClasseTeste2();
//		Thread t3 = new Thread(t2);
//		t3.start();
//		ClasseTeste t = new ClasseTeste();
//		t.start();

		
		Contador c = new Contador();
		// sempre chama o start. vai executar o run
		c.start();
		
		Contador2 c2 = new Contador2();
		Thread t2 = new Thread(c2);
		t2.start();
		
		// o escalonador vai definir quem executa primeiro. 
		// não temos a grantia de quem vai ser executado primeiro. 
		
		for (int i = 0; i <10; i++) {
			System.out.println("no main ->"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
