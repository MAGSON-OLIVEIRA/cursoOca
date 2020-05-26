package colletionsApi.com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Listas {

	public static void main(String[] args) {
		
		// interface
		
		ArrayList l = new ArrayList();
		List<String> ls = new ArrayList<>();
		ls.add("abc");
		ls.add("def");
		ls.set(1, "jhl"); // o meto set vai substituir o que esta no posição 1
		ls.add(0,"def2"); // com o indice acrescente realocando na posião. 
		
		
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(Arrays.asList("q","2"));
		// pode se usar o enhaced for for(){}
	}

}
