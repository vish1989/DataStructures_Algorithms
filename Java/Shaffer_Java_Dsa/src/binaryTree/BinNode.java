package binaryTree;

/*
 * 
 */
public interface BinNode<E> {

	public E getElement();
	public void setElement(E v);
	
	public BinNode<E> left();
	
	public BinNode<E> right();
	
	public boolean isLeaf();
	
}
