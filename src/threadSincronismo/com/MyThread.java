package threadSincronismo.com;

public class MyThread  extends Thread{
	private Cont cont;
	
	public MyThread(Cont c) {
		cont = c;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			cont.incrementar();
		}
	}
	
}
