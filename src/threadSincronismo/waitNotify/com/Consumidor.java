package threadSincronismo.waitNotify.com;

import java.util.Random;

public class Consumidor extends Thread {
	private static Random rn = new Random();
	private Buffer buffer;
	
	public Consumidor(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		while(true) {
			buffer.consmir();
			try {
				Thread.sleep(rn.nextInt(300));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
