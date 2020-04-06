package strings.com;

public class StrinsPrincipal {

	public static void main(String[] args) {
		// criação de string no RIP criando uma nova string na memoria.
		String s = new String("abc");
		
		//criando string literal, cria um objeto no RIP, mas apos isso armazena a string em um espaço no pool. para ser usada em outras variaveis
		// se necessario. 
		String s1 = "abc";
		String s2 = "abc";
	}

}
