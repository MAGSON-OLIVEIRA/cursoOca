package threadSincronismo.sync.com;

public class Aplicacao {

	public static void main(String[] args) throws InterruptedException {
		ContaBancaria conta = new ContaBancaria();
		
		Pessoa pessoa = new Pessoa(conta);
		Thread thread = new Thread(pessoa);
	
		Pessoa pessoa1 = new Pessoa(conta);
		Thread thread1 = new Thread(pessoa1);
		
		thread.start();
		thread1.start();
		
		thread.join();
		thread1.join();
		
		System.out.print(conta.getSaldo());

	}

}
