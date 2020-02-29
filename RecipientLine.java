/**
 * RecipientLine is a class that implements RecipientLineInterface
 * @author Shenabeth Jenkins
 */

public class RecipientLine implements RecipientLineInterface{
	//fields
	MyQueue<Recipient> rQueue;
	
	
	//constructors
	/**
	 * no arg constructor
	 */
	public RecipientLine() {
		//create a queue
		rQueue = new MyQueue<>();
	}
	
	/**
	 * 1 arg construcotr; takes a given size for queue
	 * @param size
	 */
	public RecipientLine(int size) {
		rQueue = new MyQueue<>(size);
	}
	
	
	//overridden methods
	@Override
	public boolean addNewRecipient(Recipient rc) throws RecipientException {
		//check if full
		if (rQueue.isFull()) {
			throw new RecipientException("Recipient queue is full.");
		}
		
		else {
			return rQueue.enqueue(rc);
		}
	}

	@Override
	public Recipient recipientTurn() throws RecipientException {
		//check if full
		if (rQueue.isEmpty()) {
			throw new RecipientException("Recipient queue is empty.");
		}
		
		else {
			return rQueue.dequeue();
		}
	}

	@Override
	public boolean recipientLineEmpty() {
		return rQueue.isEmpty();
	}

	@Override
	public Recipient[] toArrayRecipient() {
		//array
		Object[] oldArray = rQueue.toArray(); 
		Recipient[] newArray = new Recipient[rQueue.size()];

		//loop
		for (int i = 0; i <	rQueue.size(); i++) {
			//copy
			newArray[i] = (Recipient)oldArray[i]; 
		}

		//return
		return newArray;
	}

}
