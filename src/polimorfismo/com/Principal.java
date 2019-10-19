package polimorfismo.com;

public class Principal {

	public static void main(String[] args) {
		Animal a = new Cachorro();
		
		a.nomeDoSomDosAnimais();
		
		// para poder chamar o metodo pedigrir precisar fazer o cast da variavel tip Animal para
		// o tipo cacharro
		Cachorro novA = (Cachorro) a;
		novA.pedigrir();
		
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
		
		// pedigrir so no obejeto cacharro. ent�o para funcionar o A super classe tamb�m
		// tem que ter o metodo pedigrir()
		//an.pedigrir();
		
		
		// Exempo de instanceOf
		
		System.out.println(an instanceof Cachorro);
		System.out.println(an instanceof Gato);
		
		
		Animal novoa = new Cachorro();
		Cachorro novoCachorro = (Cachorro) novoa;
		novoCachorro.ok = 30;
		

	}

}
