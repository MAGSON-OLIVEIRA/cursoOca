package polimorfimo.bebida.com;

public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite", true);
	}
	
	@Override
	public void preparar() {
		System.out.println("Leite preparado");
	}

}
