package heranca.com;

public class Celular extends Telefone {
	
	public void alterarNum (int num) {
		this.num = num;
	}
	

	
	@Override  // sobrescrita de metodo
	public void telefonar() {
		
	}
	
	// n�o � sobrescrita de metodo
	public void telefonar(int num) {
		
	}
	
	

}
