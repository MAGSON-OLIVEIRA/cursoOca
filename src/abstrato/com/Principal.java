package abstrato.com;

public class Principal {

	public static void main(String[] args) {
		
		// instancia em memoria é do tipo cacharro. 
		// 
		Animal a = new Cachorro();
		
		Diamante d = new Diamante();
		d.pegar();
		
		Cogumelo c = new Cogumelo();
		c.pegar();
		
		Moeda m = new Moeda();
		m.pegar();
		
		Item i = new Moeda();
		i.getPosX();
		
	}

}
