package tratamentoExeption.com;

public class Banco {
	
	public void realizarOpercao() throws BancoExcption {
		ContaBancaria c = new ContaBancaria(1000);
		try {
			c.sacar(-100);
			System.out.println("Saque realizado com sucesso");
			
		} catch (ValorNegativoException e) {
			throw new BancoExcption("Erro, valor negativo não pode", e);
		}catch (SaldoInsuficienteException e) {
			throw new BancoExcption("Erro,não rola.", e);
		}finally {
			System.out.println(c.getSaldo());
		}

	}

}
