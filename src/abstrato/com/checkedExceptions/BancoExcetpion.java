package abstrato.com.checkedExceptions;

public class BancoExcetpion extends Exception {

	public BancoExcetpion() {
		super();
	}

	public BancoExcetpion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BancoExcetpion(String message, Throwable cause) {
		super(message, cause);
	}

	public BancoExcetpion(String message) {
		super(message);
	}

	public BancoExcetpion(Throwable cause) {
		super(cause);
	}

}
