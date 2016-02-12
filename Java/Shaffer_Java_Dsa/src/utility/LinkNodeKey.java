package utility;

/**
 * 
 * @author vish
 * LinkNode Class
 */
public class LinkNodeKey<K, E> {

	private E element;
	private K key;
	private LinkNodeKey<K, E> next;
	private LinkNodeKey<K, E> prev;
	
	LinkNodeKey(K key,E element) {
		this.element = element;
		this.key = key;
		this.next = null;
		this.prev = null;
	}
	
	LinkNodeKey(K key, E element, LinkNodeKey<K, E> next, LinkNodeKey<K, E> prev) {
		this.element = element;
		this.key = key;
		this.next = next;
		this.prev = prev;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public LinkNodeKey<K, E> getNext() {
		return next;
	}

	public void setNext(LinkNodeKey<K, E> next) {
		this.next = next;
	}

	public LinkNodeKey<K, E> getPrev() {
		return prev;
	}

	public void setPrev(LinkNodeKey<K, E> prev) {
		this.prev = prev;
	}
		
}
