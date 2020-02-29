/**
 * Recipient class
 * @author Shenabeth Jenkins
 */

public class Recipient {
	
	//fields
	private String recipientName;
	
	
	//constructor
	/**
	 * no arg constructor
	 */
	public Recipient(String recipientName) {
		this.recipientName = recipientName;
	}
	
	
	//methods
	/**
	 * get recipient name
	 * @return recipient name
	 */
	String getName() {
		return recipientName;
	}
	
	
	//toString method
	/**
	 * return the recipient name string
	 */
	public String toString() {
		return recipientName;
	}
	
}
