package stacks_queues;

import utility.LinkNode;

/**
 * 
 * @author vish
 * in the LinkNode, only prev is used
 *            Top
 *              |
 * e1 <- e2 <- e3
 * @param <E>
 */
public class LStack<E> extends Stack<E> {

	private LinkNode<E> top;
	private int length;

	LStack() {
		top = null;
		length = 0;
	}
	
	@Override
	public void clear() {
		length = 0;
		top = null;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		top = new LinkNode<E>(e, null, top);
		length++;
	}

	@Override
	public boolean isEmpty() {
		return (length == 0);
	}

	@Override
	public E pop() {
		if(!isEmpty()) {
			E e = top.getElement();
			top = top.getPrev();
			length--;
			return e;
		}
		return null;
	}

	@Override
	public int length() {
		return length;
	}

	@Override
	public E topValue() {
		if(!isEmpty()) {
			return top.getElement();
		}
		return null;
	}

}
