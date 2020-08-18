package polimorfimo.bebida.com;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		LeiteQuente lei = new LeiteQuente();
		
		Refrigerante ref = new Refrigerante();
		
		Preparador preparar = new Preparador();
		//preparar.prepararBebida(lei);
		
		//preparar.prepararBebida(lei);
		
		List<Bebida> bebidas = new ArrayList<Bebida>();
		bebidas.add(ref);
		bebidas.add(lei);
		
		preparar.prepararBebida(lei);
		//preparasbebidas(bebidas);
		
		
		

	}
	
	
	public static void preparasbebidas(List<? extends Bebida> bebids) {
		
		bebids.forEach(bbs -> bbs.preparar());
		
	}
	
	public static void preparasbebidas2(List<? super Refrigerante> bebids) {
		
	}
	
	public static void preparasbebidas3(List<?> bebids) {
		
	}
	//seria o mesmo do de cima
	public static void preparasbebidas4(List<? extends Object> bebids) {
		
	}

}
