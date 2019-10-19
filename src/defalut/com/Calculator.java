package defalut.com;

public interface Calculator {
	double calculate();
	default double calculatorPow(double x, int y) {
		return Math.pow(x, y);
	}
	
	default void logInfo(String msn) {
		salvarLog(msn);
	}
	
	default void logErro(String msn) {
		salvarLog(msn);
	}
	
	private void salvarLog(String msn) {
		
	}

}
