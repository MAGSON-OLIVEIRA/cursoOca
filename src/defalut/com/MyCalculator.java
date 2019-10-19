package defalut.com;

public class MyCalculator  implements Calculator {

	@Override
	public double calculate() {
		return 2.0 + 4.0;
	}
	
	static double calculatePow(double e, double o) {
		return e+o;
	}

}
