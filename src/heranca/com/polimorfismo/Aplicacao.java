package heranca.com.polimorfismo;

public class Aplicacao {

	public static void main(String[] args) {
		// aqui a variavel animal recebe um objeto criado na memoria do tipo Cachorro (new cachorro)
		Animal c = new Cachorro();
		// aqui a variavel animal recebe um objeto criado na memoria do tipo gato (new gato)
		Animal g = new Gato();
		
		Cachorro cachorro = (Cachorro)c;
		cachorro.acaoCachorro();

		
		// n�o � possivel chamar o metodo acaoCachorro, a variavel � do tipo  animal e em animal n�o tem o metodo moder. 
		// Animal � um espelho para o objeto na memoria do tipo cachorro 
		
		getDescricao(g);
	}

	private static void getDescricao(Animal c) {
		c.acaoGenerica();
		if(c instanceof Gato) {
			System.out.println("gato");
		}
		
		if(c instanceof Cachorro) {
			System.out.println("Cachorro");
		}
		
	}

}
