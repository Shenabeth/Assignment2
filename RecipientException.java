/**
 * RecipientException is an exception class that extends Runtime Exception
 * @author Shenabeth Jenkins
 */

public class RecipientException extends RuntimeException {
	public RecipientException(){};

	RecipientException(String message) {
		super(message);
	}
}
