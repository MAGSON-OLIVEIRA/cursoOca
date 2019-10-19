package defalut.com;

public interface Automovel {
	int a =2;
	public int b = 2;
	public static int c = 3;
	public static final int d = 4;
	 static void tes() {
		 
	 }
	void acelerar();
	void frear();
	
	default void derrapar() {
		acelerar();
		frear();
		System.out.println("Agora derrapou");
	}
	
	static int velocidadeMaxima() {
		return 300;
	}

}
