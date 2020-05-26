package colletionsApi.com.mapas;

public class Produto  {
	
	private int id;
	private String descricao;
	
	public Produto(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
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
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Produto)) {
			return false;
		}
		Produto other = (Produto) obj;
		
		if(this.id == other.id) {
			return true;			
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		// teoria do balde ger um has 
		return  String.valueOf(id).hashCode();
	}
	

}
