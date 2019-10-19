package polimorfimo.bebida.com;


// classe que faz a regra de negocio. 
public class Preparador {
	
	public void prepararBebida(Bebida bebida) {
		System.out.println("Preparando bebida "+bebida.getNome());
		bebida.preparar();
		
		if (bebida.isAquecida()) {
			System.out.println("Bebida é aquecida!! "+bebida.getNome());
		}else {
			System.out.println("Bebida é fria!! "+bebida.getNome());
		}
		
		System.out.println("Bebida paparada com sucesso.");
	}
	
}
