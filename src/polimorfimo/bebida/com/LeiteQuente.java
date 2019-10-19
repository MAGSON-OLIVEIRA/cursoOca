package polimorfimo.bebida.com;

public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Cha", true);
	}
	
	@Override
	public void preparar() {
		System.out.println("Leite preparado");
	}

}
