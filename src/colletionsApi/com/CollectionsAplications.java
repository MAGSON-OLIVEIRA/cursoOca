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
	 * Mant�m ordena��o especifica entre os elementos
	 * Repsentandas pela interface java.util.List
	 * List � um interface. 
	 * 			ArrayList implimento uma List
	 * size o tamanho da lista
	 * get retorna um o elemento da lista. 
	 * Todas as cole��o s�o gen�ricas
	 * trabalham apenas com tipos Objects
	 * retorn um tipo objects
	 * enhanced-for for(){}
	 * 
	 * Generics 
	 * trabalha com o tipo que foi definido. define o tipo de dados do elementos da cole��o.  
	 * Evita o casting
	 * Ja acusar o erro. 
	 * 
	 * Ordena��o de listas
	 * Collections 
	 * Metodo Static sort faz a ordera��o da lista
	 * Collections.sort();
	 * Importante o elemento da cole��o implementa a interface java.lang.Comparable
	 * ou Se um util.Comparate
	 * O desev deverar implemente a regra de como os elementos ser�o implementados. 
	 * Lista imut�veis. 
	 * N�o pode sofrer altera��o. 
	 * no java 9 tem uma forma simples. 
	 * usando  apartir do java9  List<Integer> inteiros = List.of(1,2,3); usar os varags
	 * 
	 * Consutos 
	 * n�o permite elementos iguais
	 * a order n�o � mesmoa da inser��o. 
	 * representado interface set. 
	 * n�o garante ordem nos elementos. 
	 * Set var = new HashSet();
	 * Elemento duplicados s�o ignorados, so apresenta 1 vez. 
	 * 
	 * Set varoutro = new LinkedHasSet();
	 * garante a ordem da inser��o.
	 * 
	 *  Set var = new TreeSet();
	 *  orderna��o e feito no criteria de inser��o. 
	 *  o criterio e definido como nas lista. 
	 *  
	 *  com o compareble ou compareito
	 *  
	 *  
	 *  
	 *  Equals() e HashCode()
	 *  
	 *  equals() - saber se objeto s�o iguais. por um ou mais atributos 
	 *  verificar esses atributos. n�o a referencia de memoria. 
	 *  
	 *  hashCode() n�o recebe parametro  e retorna int
	 *  faz um calculo. 
	 *  � utilizado em um conjuto para saber 
	 *  Aonde vai ser colocado 
	 *  
	 *  Regras. 
	 *  Se dois objetos s�o iguais devem ter o mesmo
	 *  hashCode
	 *  Se dois objetos s�o diferentes, pode ou n�o ter o mesmo hasCode
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
