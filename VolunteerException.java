/**
 * VolunteerException is an exception class that extends Runtime Exception
 * @author Shenabeth Jenkins
 */

public class VolunteerException extends RuntimeException {
	public VolunteerException(){};

	VolunteerException(String message) {
		super(message);
	}
}
