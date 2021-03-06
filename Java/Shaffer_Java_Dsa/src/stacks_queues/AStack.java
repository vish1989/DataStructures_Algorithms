package stacks_queues;

/**
 * Array based stack with default maxsize 1000
 * top points to current index of last element filled
 * if top = -1, then no elements
 * if top = MAX_SIZE - 1, then it is full
 * @author vish
 *
 */
public class AStack<E> extends Stack<E>{
	int MAX_SIZE;
	int top;
	E[] stackArray;
	
	AStack() {
		this.top = -1;
		this.MAX_SIZE = 1000;
		stackArray = (E[])new Object[MAX_SIZE];
	}
	
	AStack(int MAX_SIZE) {
		this.top = -1;
		this.MAX_SIZE = MAX_SIZE;
		stackArray = (E[])new Object[MAX_SIZE];
	}
	
	@Override
	public void clear() {
		this.top = -1;
	}
	
	@Override
	public void push(E e) {
		if(top == MAX_SIZE - 1) {
			try {
				throw new Exception("Stack is already full");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		stackArray[++top] = e;
		
	}
	
	@Override
	public boolean isEmpty() {
		return top == -1;
	}
	@Override
	public E pop() {

		if(!isEmpty()) {
			return stackArray[top--];
		}
		return null;
	}
	@Override
	public int length() {
		return top + 1;
	}
	
	@Override
	public E topValue() {
		if(!isEmpty()) {
			return stackArray[top];
		}
		return null;
	}
}
