package array.com.br;

public class VarargsAplication {

	public static void main(String[] args) {
		imprimir("a");
		imprimir("a","c");
		imprimir("a","o","3");
		
		String[] array = {"w","e"};
		imprimir(array);

	}
	
	private static void imprimir(String...strings) {
		for(String s: strings) {
			System.out.print(s);
		}
		System.out.print("\n");
	}

}
