package polimorfimo.bebida.com;

public class Refrigerante extends Bebida {

	public Refrigerante() {
		super("Refrigerante", false);
	}
	
	
	@Override
	public void preparar() {
		System.out.println("Refrigerante Preparado!!");
	}

}
