package uncheckedExceptions;

public class Rodar {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		try {
		boolean iguais = Comparador.Comparador(null, o2);
		System.out.println(iguais);
		}catch (Exception e) {
			System.out.println("Obj null");
		}
		
	}

}
