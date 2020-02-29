/**
 * Container is a class that implements ContainerInterface
 * @author Shenabeth Jenkins
 */

public class Container implements ContainerInterface {
	
	//fields
	private MyStack<DonationPackage> stack;
	
	
	//constructor
	/**
	 * no arg constuctor
	 */
	public Container() {
		stack = new MyStack<DonationPackage>();
	}
	
	/**
	 * 1 arg constructor based on size
	 * @param size
	 */
	public Container(int size) {
		stack = new MyStack<DonationPackage>(size);
	}
	
	
	//methods
	/**
	 * determine is the stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public DonationPackage getFirst() {
		//check if empty
		if (stack.isEmpty()) {
			return (DonationPackage) stack.peek();
		}
		//otherwise there is no first
		else {return null;}
	}
	
	//overridden methods
	@Override
	public boolean loadContainer(DonationPackage dPackage) throws ContainerException {
		//check if full
		if (stack.isFull()) {
			throw new ContainerException("The container is full.");
		}
		
		else {
			return stack.push(dPackage);
		}
	}

	@Override
	public DonationPackage removePackageFromContainer() throws ContainerException {
		//check if empty
		if (stack.isEmpty()) {
			throw new ContainerException("The container is empty.");
		}
		
		else {
			return stack.pop();
		}
	}

	@Override
	public DonationPackage[] toArrayPackage() {
		//array
		Object[] oldArray = stack.toArray(); 
		DonationPackage[] newArray = new DonationPackage[stack.size()];
		
		//loop
		for (int i = 0; i <	stack.size(); i++) {
			//copy
			newArray[i] = (DonationPackage)oldArray[i]; 
		}
		
		//return
		return newArray;
	}
	
	
}