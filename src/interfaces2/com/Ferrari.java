package interfaces2.com;

public class Ferrari implements Automovel, ItemCaro {

	@Override
	public void virarEsquerda() {
		System.out.println("01");
		
	}

	@Override
	public void virarDiretira() {
		System.out.println("01");
		
	}

	@Override
	public void acelar() {
		System.out.println("01");
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("abre Porta");
		
	}

	@Override
	public double valor() {
		return 12220;
	}

}
