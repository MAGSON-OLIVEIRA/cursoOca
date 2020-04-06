package execicio.stringData.com;

import java.time.LocalDate;

public class Produto {
	
	private String descriProduto;
	private Double peso;
	private LocalDate dataValidade;
	
	public String getDescriProduto() {
		return descriProduto;
	}
	public void setDescriProduto(String descriProduto) {
		this.descriProduto = descriProduto;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public LocalDate getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
}
