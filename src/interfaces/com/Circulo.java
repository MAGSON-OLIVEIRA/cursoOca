package interfaces.com;

public class Circulo implements AreaCalculavel {

	private double raio;
	
	@Override
	public double calcularArea() {
		
		return Math.PI * raio *raio;
	}

}
