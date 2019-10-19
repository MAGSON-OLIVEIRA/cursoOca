package interfaces.com;

public class Fusca implements Automovel {

	@Override
	public void virarEsquerda() {
		System.out.println("Fuca vira a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Fuca vira a direira");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Fuca vira a acelera");
	}

}
