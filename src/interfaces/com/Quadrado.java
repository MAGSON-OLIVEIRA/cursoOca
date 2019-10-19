package interfaces.com;

public class Quadrado implements AreaCalculavel {

	private double lado;	
	
	@Override
	public double calcularArea() {
		return lado * lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	
	



}
