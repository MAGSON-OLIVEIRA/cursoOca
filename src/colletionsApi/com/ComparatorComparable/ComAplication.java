package colletionsApi.com.ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComAplication {

	public static void main(String[] args) {
		
		ProdutoComparacao p1 = new ProdutoComparacao(4, "Arroz", 3.6);
		ProdutoComparacao p2 = new ProdutoComparacao(4, "Arroz", 3.6);
		ProdutoComparacao p3 = new ProdutoComparacao(4, "Lasanha", 8.0);
		ProdutoComparacao p4 = new ProdutoComparacao(4, "Macarrao", 2.9);
		ProdutoComparacao p5 = new ProdutoComparacao(4, "Lentilha", 6.5);

		
		//Set<ProdutoComparacao> produtos = new TreeSet<>(); // usando Comparable
		// Set<ProdutoComparacao> produtos = new TreeSet<>(new ProdutoComparacao2()); // usando o Comparator. usando a classe com implementa o comparator
		
		// em lista não retirar os valore duplicatos 
		List<ProdutoComparacao> produtos = new ArrayList<ProdutoComparacao>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		
		//Collections.sort(produtos); // usando o compareble to da propria classe.
		Collections.sort(produtos, new ProdutoComparacao2()); // usando comparator do classe produtoCamparacao2 que implemente comparator

		for (ProdutoComparacao ps : produtos) {
			System.out.println(ps);
		}
		

	}

}
