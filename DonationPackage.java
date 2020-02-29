
public class DonationPackage {
	
	//fields
	private double weight;
	private String description;
	
	
	//constructor
	/**
	 * set description and weight of package
	 * @param description
	 * @param weight
	 */
	public DonationPackage(String description, double weight) {
		//set description
		this.description = description;
		
		//set weight
		this.weight = weight;
	}
	
	
	//methods
	/**
	 * get the description
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	
	/**
	 * determine if the weight is heavy (if it is over 20 pounds)
	 * @return
	 */
	public boolean isHeavy() {
		//if weight > 20, true
		if (weight > 20) {
			return true;
		}
		
		//otherwise it is not heavy
		else return false;
	}
	
	
	//toString method
	/**
	 * toString method for returning the description
	 */
	public String toString() {
		return (description);
	}

}
