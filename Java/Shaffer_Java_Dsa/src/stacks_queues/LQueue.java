package stacks_queues;

import utility.LinkNode;

/**
 * 
 * @author vish
 *
 * @param <E>
 */

public class LQueue<E> extends Queue<E> {
	
	private LinkNode<E> HEAD;
	private LinkNode<E> TAIL;
	private int length;

	LQueue() {
		HEAD = TAIL = null;
		length = 0;
	}
	
	@Override
	public void clear() {
		HEAD = TAIL = null;
		length = 0;
	}

	@Override
	public int length() {
		return length;
	}

	@Override
	public boolean isEmpty() {
		return ((HEAD == null) && (TAIL == null));
	}

	@Override
	public void enqueue(E e) {
		//queue is empty
		if(isEmpty()) {
			TAIL = new LinkNode<E>(e, null, null);
			HEAD = TAIL;
		} else {
			TAIL.setNext(new LinkNode<E>(e, null, null));
			TAIL = TAIL.getNext();
		}
		length++;
	}

	@Override
	public E dequeue() {
		if(!isEmpty()) {
			E e = HEAD.getElement();
			HEAD = HEAD.getNext();
			if (HEAD == null) {
				TAIL = HEAD;
			}
			length--;
			return e;
		}
		
		return null;
	}

	@Override
	public E frontVal() {
		if(TAIL != null) {
			return TAIL.getElement();
		} else {
			return null;
		}
	}

}
