package abstrato.com.checkedExceptions;

public class Banco {
	

	
	public void realizarOperacao() throws  BancoExcetpion {
		ContaBancaria c = new ContaBancaria(1000.0);
		boolean sucesso;
		try {
			sucesso = c.sacar(-100.0);
			
			System.out.println(sucesso);
			System.out.println(c.getSaldo());
		} catch (ValorNegativoException  e) {

			throw new BancoExcetpion("erro 1", e);
		}catch (SaldoInsuficienteNegativoException e) {
			throw new BancoExcetpion("erro 2", e);
		}

	}

}
