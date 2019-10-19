package defalut.com;

public class Principal {

	public static void main(String[] args) {
		//MyCalculator m = new  MyCalculator();
		//m.calculatorPow(2, 4);
		//m.calculate();
		//MyCalculator.calculatePow(2.0, 3.0);
		
		
		Ferrari f = new Ferrari();
		f.derrapar();
		
		Porche p = new Porche();
		p.derrapar();
		
		int n = Automovel.velocidadeMaxima();
		
		System.out.println(n);

	}

}
