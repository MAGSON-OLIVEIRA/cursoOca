package Stacktrace.com;

public class Aplicacao {
	
	public static void main(String[] args) {
	
	Automovel a = new Automovel();
	try {
		a.acelerar(100);
		a.acelerar(90);
	} catch (AcimadaVelocidadeException e) {
		e.printStackTrace();
	}
	
	
	}
}
