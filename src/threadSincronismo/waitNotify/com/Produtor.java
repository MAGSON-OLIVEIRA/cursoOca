package threadSincronismo.waitNotify.com;

import java.util.Random;

public class Produtor extends Thread {
	private static Random rn = new Random();
	private Buffer buffer;
	
	public Produtor(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		while(true) {
			buffer.produzir(rn.nextInt(10));
			try {
				Thread.sleep(rn.nextInt(300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
