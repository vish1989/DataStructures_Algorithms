
package utility;

public class LinkNode<E> {
	private E element;
	private LinkNode<E> next;
	private LinkNode<E> prev;
	
	public LinkNode(E element) {
		this.element = element;
		this.next = null;
		this.prev = null;
	}
	
	public LinkNode(E element, LinkNode<E> next, LinkNode<E> prev) {
		this.element = element;
		this.next = next;
		this.prev = prev;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public LinkNode<E> getNext() {
		return next;
	}

	public void setNext(LinkNode<E> next) {
		this.next = next;
	}

	public LinkNode<E> getPrev() {
		return prev;
	}

	public void setPrev(LinkNode<E> prev) {
		this.prev = prev;
	}
}
