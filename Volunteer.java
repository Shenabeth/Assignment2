/**
 * Volunteer class
 * @author Shenabeth Jenkins
 */

public class Volunteer {
	
	//fields
	private String volunteerName;
	
	
	//constructor
	/**
	 * no arg constructor
	 */
	public Volunteer(String volunteerName) {
		this.volunteerName = volunteerName;
	}
	
	
	//methods
	/**
	 * get volunteer name
	 * @return volunteer name
	 */
	String getName() {
		return volunteerName;
	}
	
	
	//toString method
	/**
	 * return the volunteer name string
	 */
	public String toString() {
		return volunteerName;
	}
	
}
