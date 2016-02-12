package binaryTree;

public class BSTNode<Key, E> implements BinNode<E> {
	
	private Key key;
	private E element;
	private BSTNode<Key, E> left;
	private BSTNode<Key, E> right;
	
	public BSTNode() {
		left = right = null;
	}
	
	public BSTNode(Key k, E element) {
		this.key = k;
		this.element = element;
		right = left = null;
	}

	public BSTNode(Key k, E element, BSTNode<Key, E> right, BSTNode<Key, E> left) {
		this.key = k;
		this.element = element;
		this.right = right;
		this.left = left;
	}
	
	public Key getKey() {
		return key;
	}
	
	public void setKey(final Key k) {
		this.key = k;
	}
	
	@Override
	public E getElement() {
		return element;
	}
	
	@Override
	public void setElement(E element) {
		this.element = element;
	}

	@Override
	public BSTNode<Key, E> left() {
		return left;
	}
	
	public void setLeft(BSTNode<Key, E> left){
		this.left = left;
	}

	@Override
	public BSTNode<Key, E> right() {
		return right;
	}
	
	public void setRight(BSTNode<Key, E> right) {
		this.right = right;
	}

	@Override
	public boolean isLeaf() {
		return (left == null) && (right == null);
	}


}
