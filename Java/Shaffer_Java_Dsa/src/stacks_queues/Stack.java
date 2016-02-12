package stacks_queues;

/**
 * 
 * @author vish
 *
 */
public abstract class Stack<E> {
	public abstract void clear();
	public abstract void push(E e);
	public abstract boolean isEmpty();
	public abstract E pop();
	public abstract int length();
	public abstract E topValue();
}
