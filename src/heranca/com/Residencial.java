package heranca.com;

public class Residencial extends Telefone {
	
	// sobrescrita do metodo da super classe
	public void telefonar() {
		
		// se caso o super for usado vai chamar o metodo da super class
		//super.telefonar();
		System.out.println("Residencial");
	}

	
	// esse exemplo não ha sobrescrita de método, 
	// Métodos sobrescritos devem ter a mesma assinatura
	// (tipo de retorno, nome do método e parametros)
	public void telefonar(int i) {
		System.out.println("Residencial");
	}
	
	public void add(int novoNumero) {
		// usando o atributo da super Classe
		this.num = novoNumero;
	}
	
	
	

}
