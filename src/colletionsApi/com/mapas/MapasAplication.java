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
		Map<Integer, Produto> map = new HashMap<>(); // não garante a ordem da insercão
		Map<Integer, Produto> map1 = new LinkedHashMap<>(); // nesse caso é garantido a ordem de insercão. 
		Map<Integer, Produto> map0 = new TreeMap<>(); // dos os tree garante a ordenação das chaves de forma crescente no caso da String ja tem comparate
		// HASHMAP
		// AS CHAVE NÃO FICA NA ORDEM DE INSERSÃO. 
		// SE USA O PUT
		// COM A CHAVE FICA MAIS FACIL PRA ENCONTRA O ITEM SEM INTERAR SOBRE O ELEMENTO. 
		
		map.put(1, new Produto(1, "p1"));
		map.put(2, new Produto(2, "p12"));
		map.put(3, new Produto(3, "p12"));
		
		
		Produto pItem = map.get(2);
		System.out.println(pItem);
		
		// interar  no map, temos duas possibilidade de interação
		// pela chave uma interação 
		// pelo valor uma nova interação.
		// map.keyset() retorna um conjuntos de chaves 
		Set<Integer> keys = map.keySet(); // um conjunto de chaves não vem elemento duplicato
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
