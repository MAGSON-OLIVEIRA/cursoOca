package abstrato.com.checkedExceptions;

public class ContaBancaria {
	private double saldo;
	public ContaBancaria(Double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(double valor) throws ValorNegativoException, SaldoInsuficienteNegativoException {
		if(valor <= 0) {
			throw new ValorNegativoException(valor);
		}
		
		if(saldo-valor < 0) {
			throw new SaldoInsuficienteNegativoException(valor, saldo);
		}
		
		this.saldo -= valor;
		
		return true;
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
