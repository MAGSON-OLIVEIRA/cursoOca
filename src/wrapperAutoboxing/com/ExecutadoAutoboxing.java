package wrapperAutoboxing.com;

public class ExecutadoAutoboxing {

	public static void main(String[] args) {

		// mostrando uso de auto com se fosse na java antigo 1.4
		Handlerss h = new Handlerss();
		
		Integer i = Integer.valueOf(22);
		h.setObject(i);
		
		Integer i2 = (Integer) h.setObject(i);
		int i3 = i2.intValue();
		System.out.println(i3);
		
		
		// fazendo o auto boxing java novo 12
		
		int i4 = 10;
		int i5 = (int) h.setObject(i);
		
		
		///// outro exemplo como se fosse versão antiga auto boxin
		//Double d1 = Double.valueOf(5);
		//Double d2 = Double.valueOf(4);
		///// teria que convert para double primitivo na versão antiga
		//double d = somar(d1.doubleValue(),d2.doubleValue());
		
		
		///// Na versao nova faz o autobox altomatico de um tipo Classe Warpper para um Tipo Primitivo.
		//Double d1 = 5.0;
		//Double d2 = 4.0;
		///// o metodo somar espera um tipo primito e retorna um tipo primitivo.
		///// autoboxing e feito na entrada e saida, d é um tipo Double classe warpper mas recebe um double primitivo. 
		//Double d = somar(d1,d2);
		
		//ex usando versão antiga para usar ++
		Integer is = Integer.valueOf(5);
		int is2 = is.intValue();
		is2++;
		is = Integer.valueOf(is2);
		
		// agora usando versão novas
		Integer ise = 5;
		ise++;
		// assim ja foi feito o incremento. 

	}
	
	private static double somar(double d1, double d2) {
		return d1 + d2;
	}
	
	

}
