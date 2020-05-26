package colletionsApi.com.ComparatorComparable;

// comparação
public class ProdutoComparacao implements Comparable<ProdutoComparacao> {
	
	private int id;
	private String descricao;
	private double valor;
	public ProdutoComparacao(int id, String descricao, double valor) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComparacao other = (ProdutoComparacao) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ProdutoComparacao [id=" + id + ", descricao=" + descricao + ", valor=" + valor + "]";
	}
	@Override
	public int compareTo(ProdutoComparacao o) {
		// tem comparar com o campo que eu quero que eu preciso. 
		// ante depois ou igual
		// 0 -> são iguais
		// 1 -> this é maior que o
		// -1-> o é maior que this
		
		if(this.valor == o.valor) {
			return 0;
		}
		if(this.valor > o.valor) {
			return 1;
		}
		return -1;
	}
	
}
