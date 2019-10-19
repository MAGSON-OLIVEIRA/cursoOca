package tratamentoExeption.com;

public class ContaBancaria {
	
	private double saldo;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	// define que pode lan�a, mas n�o que dizer que vai
	public void sacar(double valor) throws SaldoInsuficienteException,ValorNegativoException {
		if(valor <= 0) {
			throw new ValorNegativoException(valor);
			// lan�a uma exec��o
		}
		
		if (saldo - valor < 0) {
			throw new SaldoInsuficienteException(valor, saldo);
		}
		
		this.saldo -= valor;

	}
	
	public double getSaldo() {
		return saldo;
	}

}
