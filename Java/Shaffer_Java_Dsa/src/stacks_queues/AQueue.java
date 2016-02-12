package stacks_queues;

/**
 * Array implementation of Queue, default size is 1000
 * @author vish
 *
 * Reserve one empty space, and HEAD always points to it for differentiating empty vs full
 * head is empty space, and head + 1 is the first element
 * if head = tail empty;
 * if (tail + 1) mod (N) = head , then full (assuming elements from 0 to N-1.
 * @param <E>
 */
public class AQueue<E> extends Queue<E>{
	
	private int MAX_SIZE;
	private int length;
	private E[] arrayQueue;
	private int HEAD;
	private int TAIL;
	
	public AQueue() {
		MAX_SIZE = 1000;
		length = 0;
		HEAD = TAIL = 0;
		arrayQueue = (E[]) new Object[MAX_SIZE];
	}
	
	public AQueue(int size) {
		MAX_SIZE = size + 1;
		length = 0;
		HEAD = TAIL = 0;
		arrayQueue = (E[]) new Object[MAX_SIZE];
	}
	
	@Override
	public void clear() {
		length = 0;
		HEAD = TAIL = 0;
	}

	@Override
	public int length() {
		return length;
	}

	@Override
	public boolean isEmpty() {
		return (TAIL == HEAD);
	}

	@Override
	public void enqueue(E e) {
		if (HEAD == (TAIL + 1) % (MAX_SIZE)) {
			return;
		}
		
		TAIL = (TAIL + 1) % (MAX_SIZE);
		arrayQueue[TAIL] = e;
		length++;
	}

	@Override
	public E dequeue() {
		if (!isEmpty()) {
			HEAD = (HEAD + 1) % (MAX_SIZE);
			E e = arrayQueue[HEAD];
			length--;
			return e;
		}
		return null;
	}

	@Override
	public E frontVal() {
		if(!isEmpty()) {
			return arrayQueue[HEAD];
		} else {
			return null;
		}
	}

}
