package abstrato.com.checkedExceptions;

public class AplicacaoCheckedEx {

	public static void main(String[] args){
		
		Banco banco = new Banco();
		try {
			banco.realizarOperacao();
		} catch (BancoExcetpion e) {
			System.out.print(e.getMessage());
			System.out.print(e.getCause());
		}

	}

}
