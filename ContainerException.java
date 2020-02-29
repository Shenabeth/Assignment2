/**
 * ContainerException is an exception class that extends Runtime Exception
 * @author Shenabeth Jenkins
 */

public class ContainerException extends RuntimeException {
	public ContainerException(){};

	ContainerException(String message) {
		super(message);
	}
}