/**
 * MyQueue is a generic class that implements QueueInterface
 * @author Shenabeth Jenkins
 * @param <T>
 */

import java.util.ArrayList;

import org.w3c.dom.ranges.RangeException;

public class MyQueue<T> implements QueueInterface {
	//fields
	private int size;
	private ArrayList<T> queue;
	
	
	//constructor
	/**
	 * no arg constructor
	 */
	public MyQueue() {
		//create queue
		queue = new ArrayList<>();
		
		//create size
		size = 100;
	}
	
	
	/**
	 * constructors that takes a set size
	 */
	public MyQueue(int size) {
		//create queue
		queue = new ArrayList<>(size);
		
		//size
		this.size = size;
	}
	
	
	//overridden methods
	/**
	 * return whether queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	/**
	 * return whether queue is full
	 */
	@Override
	public boolean isFull() {
		//must be true or false if queue size > set size
		return (queue.size() == size);
	}

	/**
	 * remove from a queue
	 */
	@Override
	public T dequeue() {
		//see if queue is empty
		if (!isEmpty()) {
			//get from queue
            T t = queue.get(0);
            
            //remove from queue
            queue.remove(0);
            
            //return
            return t;
		}
		return null;
	}

	/**
	 * return size of queue
	 */
	@Override
	public int size() {
		return queue.size();
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

	/**
	 * add to the queue
	 */
	@Override
	public boolean enqueue(Object e) {
		//if queue isn't full, add to it
		if (isEmpty()){
			queue.add(0, (T)e);
			return true;
		}
		
		else {
			int size = queue.size();
			queue.add(size, (T)e);
			return false;
		}
	}

}
