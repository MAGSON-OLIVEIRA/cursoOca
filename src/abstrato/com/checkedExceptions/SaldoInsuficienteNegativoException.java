package abstrato.com.checkedExceptions;

public class SaldoInsuficienteNegativoException extends Exception {
	
	private double valor;
	private double saldo;
	
	public SaldoInsuficienteNegativoException(double valor, double saldo) {
		this.valor = valor;
		this.saldo = saldo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
