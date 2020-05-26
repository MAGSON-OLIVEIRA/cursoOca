package array.com.br;

public class ArrayAplication {

	public static void main(String[] args) {
		int [] array  = new int[5];
		
		// criando objeto no heap. 
		// definir o tamanha de um array não pode ser mudado
		// o array armazer os objetos na memoria de maneira continua
		// array é indexado um indice. 
		
//		array[1] = 6;
//		array[2] = 5;
//		array[3] = 7;
//		array[4] = 7;
//		
//		for(int i =0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//		
//		// hinRandsFor
//		for(int j : array) {
//			System.out.print(j);
//		}
//		
		// 
		
		String[] ar = new String[5];
		
		ar[2] = "A";
		ar[1] = "C";
		ar[4] = "K";
		
		for(String s : ar) {
			System.out.print(s);
		}
		
		Object[] abs = new Object[5];
		abs[2] = "a";
		abs[4] = new Object();
		abs[0] = new int[2];
		abs[1] = 10;
		
		for(Object o : abs) {
			System.out.print(o);
		}
		
		String ei = (String) abs[2];
		int eee = (int) abs[10];
	}

}
