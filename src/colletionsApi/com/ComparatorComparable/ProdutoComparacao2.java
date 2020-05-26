package colletionsApi.com.ComparatorComparable;

import java.util.Comparator;

// comparação
public class ProdutoComparacao2 implements Comparator<ProdutoComparacao> {

	@Override
	public int compare(ProdutoComparacao o1, ProdutoComparacao o2) {
		// o java assume que eles são iguais. 
		// so mostro um item. mas se retorna 1 mostra os dois
		if(o1.getDescricao().equals(o2.getDescricao())) {
			//return 0;
			return 1;
		}
		
		if(o1.getDescricao().compareTo(o2.getDescricao())>0) {
			return 1;
		}
		
		
		return -1;
	}
	
	
	
}
