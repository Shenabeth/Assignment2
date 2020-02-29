/**
 * VolunteerLine is a class that implements VolunteerLineInterface
 * @author Shenabeth Jenkins
 */

public class VolunteerLine implements VolunteerLineInterface {
	//fields
	MyQueue<Volunteer> vQueue;
	
	
	//contructors
	/**
	 * no arg constructor
	 */
	public VolunteerLine() {
		//create a queue
		vQueue = new MyQueue<>();
	}
	
	
	/**
	 * 1 arg construcotr; takes a given size for queue
	 * @param size
	 */
	public VolunteerLine(int size) {
		vQueue = new MyQueue<>(size);
	}
	
	
	//overridden methods
	@Override
	public boolean addNewVolunteer(Volunteer v) throws VolunteerException {
		//check if full
		if (vQueue.isFull()) {
			throw new VolunteerException("Volunteer queue is full");
		}
		
		else {
			return vQueue.enqueue(v);
		}
	}

	@Override
	public Volunteer volunteerTurn() throws VolunteerException {
		//check if empty
		if (vQueue.isEmpty()) {
			throw new VolunteerException("Volunteer queue is empty.");
		}
		
		else {
			return vQueue.dequeue();
		}
	}

	@Override
	public boolean volunteerLineEmpty() {
		return vQueue.isEmpty();
	}

	@Override
	public Volunteer[] toArrayVolunteer() {
		//array
		Object[] oldArray = vQueue.toArray(); 
		Volunteer[] newArray = new Volunteer[vQueue.size()];

		//loop
		for (int i = 0; i <	vQueue.size(); i++) {
			//copy
			newArray[i] = (Volunteer)oldArray[i]; 
		}

		//return
		return newArray;
	}

}