package colletionsApi.com.conjunto;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoAplication {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<>();
//		// n�o deixa inserir valor com o mesmo valor. n�o deixar duplicar.  
//		// n�o segue a ordem de inser��o
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
//		// n�o deixa inserir valor com o mesmo valor. n�o deixar duplicar.  
//		// nesse casso linkdHasSete mantei a orde de insers�o. 
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
		// n�o deixa inserir valor com o mesmo valor. n�o deixar duplicar.  
		// nesse casso treeSet usa redblackTree para orderna��o n�o a de inser��o
		// faz a ordena��o na inser��o faz ardean��o alfabetica. ou ordem crescente. Usa a String com a interface compara..
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
