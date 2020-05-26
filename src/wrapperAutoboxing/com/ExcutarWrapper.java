package wrapperAutoboxing.com;

public class ExcutarWrapper {

	public static void main(String[] args) {
		
		Integer i = Integer.valueOf(20);
		Double d = Double.valueOf(23.3);
		imprimr(i);
		
		// intValue retorna o valor primitivo do wrappers
		int i2 = i.intValue();
		double d2 = d.intValue();
		// exemplos de parses
		Integer i3 = Integer.valueOf("23");
		Double d3 = Double.valueOf("22.2");
		int i4 = Integer.parseInt("21");
		double d4 = Double.parseDouble("22.2");
		
		String bim = "0111"; //7 param entrada em binario tipo string sai int 7
		int i5 = Integer.parseInt(bim, 2);
		System.out.println(i5);
		
		String bin2 = Integer.toBinaryString(7);
		// saida de num int em binario
		System.out.println(bin2);
		
		// autoboxing internament é colocado o int numa classe wrapper Integer
		imprimr(100);

	}
	
	private static void imprimr(Object obj) {
		System.out.println(obj);
	}

}
