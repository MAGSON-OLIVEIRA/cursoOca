package interfaces.com;

public class Ferrari implements Carro, ItemCaro {

	@Override
	public void virarEsquerda() {
		System.out.println("Virar esquerda");
	}

	@Override
	public void virarDireita() {
		System.out.println("Virar diretria");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerar");
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("Abri porta ");
		
	}

	@Override
	public double getPreco() {
		return 1000.00;
	}

}
