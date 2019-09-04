package polimorfismo.com;

public class Principal {

	public static void main(String[] args) {
		Animal a = new Cachorro();
		
		a.nomeDoSomDosAnimais();
		
		Animal v = new Vaca();
		
		v.nomeDoSomDosAnimais();
		
		Animal g = new Gato();
		
		g.nomeDoSomDosAnimais();
		
		// outro exemplo
		
		Cachorro c = new Cachorro();
		Animal an =  (Animal) c;
		an.nomeDoSomDosAnimais();
		// vai sair late
		// pq a forma como o objeto é referenciado não influencia na decisão. 
		// sobre qual método será invocado
		
		
		

	}

}
