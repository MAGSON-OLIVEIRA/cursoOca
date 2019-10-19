package Stacktrace.com;

public class AcimadaVelocidadeException extends Exception{
	
	private String msn;
	
	public AcimadaVelocidadeException(String msn) {
		this.msn = msn;
	}
	
	
	public String getMsn() {
		return msn;
	}

}
