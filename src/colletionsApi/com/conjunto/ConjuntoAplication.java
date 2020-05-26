package colletionsApi.com.conjunto;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoAplication {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<>();
//		// não deixa inserir valor com o mesmo valor. não deixar duplicar.  
//		// não segue a ordem de inserção
//		set.add("A7");
//		set.add("B6");
//		set.add("C5");
//		set.add("D4");
//		set.add("F2");
//		set.add("G1");
//		set.add("G1");
//		
//		for(String s : set) {
//			System.out.println(s);
//		}
		
//		Set<String> set = new LinkedHashSet<>();
//		// não deixa inserir valor com o mesmo valor. não deixar duplicar.  
//		// nesse casso linkdHasSete mantei a orde de insersão. 
//		set.add("A7");
//		set.add("B6");
//		set.add("C5");
//		set.add("D4");
//		set.add("F2");
//		set.add("G1");
//		set.add("G1");
//		
//		for(String s : set) {
//			System.out.println(s);
//		}
		
		
		Set<String> set = new TreeSet<>();
		// não deixa inserir valor com o mesmo valor. não deixar duplicar.  
		// nesse casso treeSet usa redblackTree para ordernação não a de inserção
		// faz a ordenação na inserção faz ardeanção alfabetica. ou ordem crescente. Usa a String com a interface compara..
		set.add("B7");
		set.add("A6");
		set.add("F5");
		set.add("D4");
		set.add("C2");
		set.add("G1");
		set.add("G1");
		
		for(String s : set) {
			System.out.println(s);
		}

	}

}
