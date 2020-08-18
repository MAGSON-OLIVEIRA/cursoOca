package heranca.com.polimorfismo;

public class Cachorro extends Animal {
	
	@Override
	public void acaoGenerica() {
		System.out.println("Late");
	}
	
	public void acaoCachorro() {
		System.out.println("Morde");
	}

}
