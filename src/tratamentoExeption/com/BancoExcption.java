package tratamentoExeption.com;

public class BancoExcption extends Exception {

	public BancoExcption() {
		
	}

	public BancoExcption(String message) {
		super(message);
	}

	public BancoExcption(Throwable cause) {
		super(cause);
	}

	public BancoExcption(String message, Throwable cause) {
		super(message, cause);
	}

	public BancoExcption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
