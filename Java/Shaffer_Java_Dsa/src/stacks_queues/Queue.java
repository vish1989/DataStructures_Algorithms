package stacks_queues;

/**
 * 
 * @author vish
 * ADT for Queue
 * @param <E>
 */
public abstract class Queue<E> {
	public abstract void clear();
	public abstract int length();
	public abstract boolean isEmpty();
	public abstract void enqueue(E e);
	public abstract E dequeue();
	public abstract E frontVal();
}
