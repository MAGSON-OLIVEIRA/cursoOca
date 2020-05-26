package threadSincronismo.com;

public class ThreadsProblemasAplication {

	public static void main(String[] args) {
		// a saida tinha que ser 100 X 1000 100.000
		
		// executando sem o sychonize não estar saindo o valor correto. 
		// o cont increment() estar sendao acessado por varias thread simultneamente o valor do atribu valor esta se perdendo. 
		//
		
		MyThread[] threads = new MyThread[1000];
		
		Cont c = new Cont();
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread(c);
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print(c.getValor());

	}

}
