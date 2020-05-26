package colletionsApi.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import colletionsApi.com.mapas.Produto;

public class EqualsHashCode {

	public static void main(String[] args) {
			
		Produto p1 = new Produto(1, "Produto1");	
		Produto p2 = new Produto(1, "Produto1");
		Produto p3 = p2;
		
		// HashSet não deixa duplicar registro
		Set<Produto> prds = new HashSet<Produto>();
		prds.add(p1);
		prds.add(p2);
		prds.add(p3);// não aparece referencia o mesmo objeto hashset não duplica
		// foi acrescentado o equals e hashcode. 
		// o que faz a igualdade o objto agora e o id
		
		
		Iterator<Produto> iter = prds.iterator();
		while(iter.hasNext()) {
			System.out.println(">>"+iter.next());
		}
	}

}
