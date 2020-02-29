
public class DonationManager implements DonationManageInterface {
	//fields
	RecipientLine rLine;
	VolunteerLine vLine;
	Container container;
	
	
	//constructor
	/**
	 * no arg constructor
	 */
	public DonationManager() {
		//create recipient line
		rLine = new RecipientLine();
		
		//create volunteer line
		vLine = new VolunteerLine();
		
		//create container
		container = new Container();
	}
	
	
	//overridden methods
	/**
	 * load the container
	 */
	@Override
	public boolean managerLoadContainer(DonationPackage dPackage) throws ContainerException {
		return container.loadContainer(dPackage);
	}

	/**
	 * add volunteer
	 */
	@Override
	public boolean managerQueueVolunteer(Volunteer v) throws VolunteerException {
		return vLine.addNewVolunteer(v);
	}

	/**
	 * add recipient
	 */
	@Override
	public boolean managerQueueRecipient(Recipient r) throws RecipientException {
		return rLine.addNewRecipient(r);
	}

	/**
	 * manage package by throwing exceptions if needed
	 */
	@Override
	public int donatePackage() throws VolunteerException, ContainerException, RecipientException {
		//empty recipient line
		if (rLine.recipientLineEmpty()) {
			throw new RecipientException("The recipient queue is empty.");
		}
		
		//empty volunteer line
		else if (vLine.volunteerLineEmpty()) {
			throw new VolunteerException("The volunteer queue is empty.");
		}
		
		//empty container
		else if (container.isEmpty()) {
			throw new ContainerException("The container is empty.");
		}
		
		//otherwise 
		else {
			//dequeue recipient
			rLine.recipientTurn();
			
			//remove package
			container.removePackageFromContainer();
			
			//add new volunteer to line
			vLine.addNewVolunteer(vLine.volunteerTurn());
		}
		
		return 0;
	}

	/**
	 * returns array package stack
	 */
	@Override
	public DonationPackage[] managerArrayPackage() {
		return container.toArrayPackage();
	}

	/**
	 * returns volunteers in queue
	 */
	@Override
	public Volunteer[] managerArrayVolunteer() {
		return vLine.toArrayVolunteer();
	}

	/**
	 * returns recipients in queue
	 */
	@Override
	public Recipient[] managerArrayRecipient() {
		return rLine.toArrayRecipient();
	}

	//toString method
	/**
	 * display message for when something has been donated
	 */
	public String toString() {
		return (vLine.toArrayVolunteer()[0].getName()) + "has donated " + 
				(container.toArrayPackage()[0].getDescription()) + " package to " + 
				rLine.toArrayRecipient()[0].getName();
	}
}
