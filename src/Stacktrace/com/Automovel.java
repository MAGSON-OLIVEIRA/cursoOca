package Stacktrace.com;

public class Automovel {
	private static final int VELOC_MAX = 180;
	private int velocidadeAtual;
	
	public void acelerar(int velocidade) throws AcimadaVelocidadeException {
		if(velocidadeAtual +  velocidade> VELOC_MAX) {
			throw new AcimadaVelocidadeException("Excedeu a velo.. ");
		}
		velocidadeAtual += velocidade;
	}
	
}
