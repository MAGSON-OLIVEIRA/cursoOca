package interfaces.com;

public class Principal {

	public static void main(String[] args) {
		//AreaCalculavel a = new Quadrado();
		//System.out.println(a.calcularArea());
		
		
		//
		Diamente diamante = new Diamente();
		
		Ferrari ferrari =  new Ferrari();
		//Fusca fusca = new Fusca();
		//Rota rota = new Rota();
		//rota.ir(fusca);
		
		Vendedor vendedor = new Vendedor();
		vendedor.mostrarPrecodoItem(ferrari);
		vendedor.mostrarPrecodoItem(diamante);
		

	}

}
