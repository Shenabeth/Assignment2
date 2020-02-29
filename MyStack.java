/**
 * MyStack is a generic class that implements StackInterface
 * @author Shenabeth Jenkins
 * @param <T>
 */

import java.util.ArrayList;

public class MyStack<T> implements StackInterface {
	//fields
	private int size;
	private ArrayList <T> stack;


	//constructors
	/**
	 * no arg constructor
	 */
	public MyStack() {
		//new array
		stack = new ArrayList<>();

		//create size
		size = 100;
	}

	/**
	 * 1 arg constructor based on size
	 * @param size
	 */
	public MyStack(int size) {
		//new array
		stack = new ArrayList<>(size);

		//set size
		this.size = size;
	}


	//overridden methods
	/**
	 * return whether stack is empty
	 */
	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	/**
	 * return whether stack is full
	 */
	@Override
	public boolean isFull() {
		return (size == (stack.size()));
	}

	/**
	 * removing from a stack
	 */
	@Override
	public T pop() {
		//see if the stack is empty
		if (!isEmpty()) {
			//remove
			T t = (stack.get(size() - 1));
			stack.remove(size() - 1);
			return t;
		}
		return null;
	}

	/**
	 * return the stack size
	 */
	@Override
	public int size() {
		return stack.size();
	}
//
	@Override
	public boolean push(Object e) {
		// TODO Auto-generated method stub
		return false;
	}
//
	/**
	 * 
	 */
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public DonationPackage peek() {
		// TODO Auto-generated method stub
		return null;
	}



}
