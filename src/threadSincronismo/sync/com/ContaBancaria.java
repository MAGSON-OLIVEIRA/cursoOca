package threadSincronismo.sync.com;

public class ContaBancaria {
	
	//private final Object monit = new Object(); // todo obj tem um look . 
	
	// podemos usar o this. que é o proprio obj ContaBancaria
	
	private double saldo = 1000;
	
	public void sacar(double valor) {
		synchronized (this) {
			saldo -=valor;
		}
	}
	public void depositar(double valor) {
		synchronized (this) {
			saldo+=valor;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
}
