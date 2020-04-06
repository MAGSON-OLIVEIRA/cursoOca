package random.com;

import java.util.Random;

public class AplicationRadom {

	public static void main(String[] args) {
		Random r = new Random();
		
		// usando uma semante inicial se torna uma sequencia fixa
		//Random r = new Random(234556);
		
		for(int i =0; i<10; i++) {
			//Double d = Math.random();
			//int d = r.nextInt();
			
			// defini inicio de 0 ao numero no parametro 
			//int d = r.nextInt(100);
			
			int d = gerarRadomDeIntervalo(20,33);
			System.out.println(d);
		}

	}
	
	static int gerarRadomDeIntervalo(int inicio, int fim) {
		int intervalo = fim - inicio;
		int n = (int) (Math.random()* intervalo) + inicio;
		
		// inter valor 33 - 20 = 13
		// math.random sempre inicia com 0,234 X 13    + 20 
		// o numero gerado 23,04
		
		return n;
	}

}
