package PJ.ConceitosIniciais;

public class Principal {

	public static void main(String[] args) {
		
		//  variaveis do tipo var assume um tipo no momento da sua atribuição 
		//  apos sua atribuição não é mais possivel mudar o tipo
		var x = 2; // assume o valor int
		var y = 10.1; // assume double
		var z = true; // assume o valor booolen
		
		// operadore de decremento e incremento. 
		// pré - fixado
		// ++x
		
		// pós - fixados
		// x++ 
		
		int i = 10;
		int e = i++;
		
		//System.out.println(e);
		
		// catin explicito
		double d = 100.0;
		int inteiro = (int) d;
		
		// cuidados 
		int inteiro1 = (int) 4.6;
		
		//System.out.println(inteiro);
		//System.out.println(inteiro1);
		
		
        int a [ ] = { 1,2,053,4};
        
        // vetor tres colunas [0,1,2] e tres linha [0,1,2]
        int b [ ][ ] = { {1,2,4} , {2,2,1},{0,43,2}};
		
       // System.out.print(a[3] == b[0][2] );
      //  System.out.print(" " + (a[2] == b[2][1]));
		
		
		// bit mais siginificativo define o sinal do numero
        // 0 é positivo, e 1 é negativo
		
        
        int in = 129;
        byte s =  (byte) in;
		
        //System.out.println(true ^ (false | true));
        
        for (int f = 0; f < 20; f++) {
        	System.out.println(f);
        }
        int f = 15;
        System.out.println(f);
        
  
        
        
        

	}

}
