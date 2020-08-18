package colletionsApi.com.mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapasAplication {
	public static void main(String[] args) {

		//  associar um valor a um chave. 
		// interface MAP 
		// PASSADOIS TIPO DE PARAMETROS
		
		// Se usar classe por exemplo INTEGER
		Map<Integer, Produto> map = new HashMap<>(); // n�o garante a ordem da inserc�o
		Map<Integer, Produto> map1 = new LinkedHashMap<>(); // nesse caso � garantido a ordem de inserc�o. 
		Map<Integer, Produto> map0 = new TreeMap<>(); // dos os tree garante a ordena��o das chaves de forma crescente no caso da String ja tem comparate
		// HASHMAP
		// AS CHAVE N�O FICA NA ORDEM DE INSERS�O. 
		// SE USA O PUT
		// COM A CHAVE FICA MAIS FACIL PRA ENCONTRA O ITEM SEM INTERAR SOBRE O ELEMENTO. 
		
		map.put(1, new Produto(1, "p1"));
		map.put(2, new Produto(2, "p12"));
		map.put(3, new Produto(3, "p12"));
		
		
		Produto pItem = map.get(2);
		System.out.println(pItem);
		
		// interar  no map, temos duas possibilidade de intera��o
		// pela chave uma intera��o 
		// pelo valor uma nova intera��o.
		// map.keyset() retorna um conjuntos de chaves 
		Set<Integer> keys = map.keySet(); // um conjunto de chaves n�o vem elemento duplicato
		// enhanceFor for percorre as chave do conjunto
		for(Integer key:keys) {
			System.out.println(key);
		}
		// map.values() retorna o cojunto de valores
		// nesse caso retorna um colection interface collection
		Collection<Produto> prodtos = map.values();
		for(Produto ps: prodtos) {
			System.out.println(ps);
		}
		
		// temos a possibilidade de trabalhar como os dois chave e valor. 
		Set<Map.Entry<Integer, Produto>> conjunto= map.entrySet();// vai retorna o conjunto veremos no for
		for(Map.Entry<Integer, Produto> ent : conjunto) {
			System.out.println( ent.getKey() +" >> "+ent.getValue() );
		}
		
		
	}
}
