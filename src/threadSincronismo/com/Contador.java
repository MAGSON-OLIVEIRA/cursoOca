package threadSincronismo.com;

public class Contador extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println("no contatdor ->"+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
