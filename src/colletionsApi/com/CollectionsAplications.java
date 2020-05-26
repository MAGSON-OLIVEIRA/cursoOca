package colletionsApi.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsAplications {
	
	/*
	 * Lista
	 * Conjutos 
	 * Mapas
	 * 	 
	 */

	
	/*
	 * Lista
	 * Permitem elementos duplicados
	 * Mantêm ordenação especifica entre os elementos
	 * Repsentandas pela interface java.util.List
	 * List é um interface. 
	 * 			ArrayList implimento uma List
	 * size o tamanho da lista
	 * get retorna um o elemento da lista. 
	 * Todas as coleção são genéricas
	 * trabalham apenas com tipos Objects
	 * retorn um tipo objects
	 * enhanced-for for(){}
	 * 
	 * Generics 
	 * trabalha com o tipo que foi definido. define o tipo de dados do elementos da coleção.  
	 * Evita o casting
	 * Ja acusar o erro. 
	 * 
	 * Ordenação de listas
	 * Collections 
	 * Metodo Static sort faz a orderação da lista
	 * Collections.sort();
	 * Importante o elemento da coleção implementa a interface java.lang.Comparable
	 * ou Se um util.Comparate
	 * O desev deverar implemente a regra de como os elementos serão implementados. 
	 * Lista imutáveis. 
	 * Não pode sofrer alteração. 
	 * no java 9 tem uma forma simples. 
	 * usando  apartir do java9  List<Integer> inteiros = List.of(1,2,3); usar os varags
	 * 
	 * Consutos 
	 * não permite elementos iguais
	 * a order não é mesmoa da inserção. 
	 * representado interface set. 
	 * não garante ordem nos elementos. 
	 * Set var = new HashSet();
	 * Elemento duplicados são ignorados, so apresenta 1 vez. 
	 * 
	 * Set varoutro = new LinkedHasSet();
	 * garante a ordem da inserção.
	 * 
	 *  Set var = new TreeSet();
	 *  ordernação e feito no criteria de inserção. 
	 *  o criterio e definido como nas lista. 
	 *  
	 *  com o compareble ou compareito
	 *  
	 *  
	 *  
	 *  Equals() e HashCode()
	 *  
	 *  equals() - saber se objeto são iguais. por um ou mais atributos 
	 *  verificar esses atributos. não a referencia de memoria. 
	 *  
	 *  hashCode() não recebe parametro  e retorna int
	 *  faz um calculo. 
	 *  é utilizado em um conjuto para saber 
	 *  Aonde vai ser colocado 
	 *  
	 *  Regras. 
	 *  Se dois objetos são iguais devem ter o mesmo
	 *  hashCode
	 *  Se dois objetos são diferentes, pode ou não ter o mesmo hasCode
	 *  
	 *  Na pratica.
	 *  SobrEscreva os dois. sempre
	 *  
	 * 	HashSet
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		List<Object> objetos = new ArrayList<Object>();
		objetos.add("Magosn");
		
		Iterator iter = objetos.iterator();

		while (iter.hasNext()) {
			// aqui terar que fazer o casting
			String nome = (String) iter.next();
			System.out.println(nome);
		}
		
		// usando o enhance-for
		for(Object ob : objetos) {
			// aqui o codigo
			String nome2 = (String) ob;
		}
		
		List<String> strings = new ArrayList<String>();
		strings.add("So String");
		Iterator<String> str = strings.iterator();
		
		while(str.hasNext()) {
			String s = str.next();
			System.out.println(s);
		}
		

	}
	
	
}
