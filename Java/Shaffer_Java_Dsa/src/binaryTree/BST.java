package binaryTree;

public class BST<Key extends Comparable<? super Key>, E> implements Dictionary<Key, E> {

	
	private BSTNode<Key, E> root;
	int nodeCount;
	
	/**
	 * Constructors
	 */
	
	BST() {
		root = null;
		nodeCount = 0;
	}
	
	
	@Override
	public void clear() {
		root = null;
		nodeCount = 0;
	}

	@Override
	public void insert(Key k, E e) {
		root = insertRecursive(root, k, e);
		nodeCount++;
	}
	
	private BSTNode<Key, E> insertRecursive(BSTNode<Key, E> node, Key k, E e) {
		if(node == null) {
			return new BSTNode<Key, E>(k, e);
			
		} else if(node.getKey().compareTo(k) > 0) {
			node.setLeft(insertRecursive(node.left(), k, e));
		} else if(node.getKey().compareTo(k) <= 0) {
			node.setRight(insertRecursive(node.right(), k, e));
			}
		return node;
	}

	@Override
	public E remove(Key k) {
		E temp = findHelper(root, k);
		if(temp != null) {
			root = removeHelper(root, k);
			nodeCount--;
		}
		return temp;
	}

	private BSTNode<Key, E> removeHelper(BSTNode<Key, E> node, Key k) {
		if(node == null) {
			return null;
		}
		if(node.getKey().compareTo(k) > 0) {
			root.setLeft(removeHelper(root.left(), k));
		} else if(node.getKey().compareTo(k) < 0) {
			root.setRight(removeHelper(root.right(), k));
		} else if(node.getKey().compareTo(k) == 0) {
			if(node.right() == null) {
				return node.left();
			} else if(node.left() == null) {
				return node.right();
			} else {
				BSTNode<Key, E> temp = getMin(node.right());
				node.setElement(temp.getElement());
				node.setKey(temp.getKey());
				node.setRight(deletemin(node.right()));
			}
		}
		
		return node;
	}
	
	private BSTNode<Key, E> getMin(BSTNode<Key, E> node) {
		if(node.left() == null) {
			return node;
		} else {
			return getMin(node.left());
		}
	}
	
	private BSTNode<Key, E> deletemin(BSTNode<Key, E> node) {
		if(node.left() == null) return node.right();
		node.setLeft(deletemin(node.left()));
		return node;
	}
	
	@Override
	public E find(Key k) {
		return findHelper(root, k);
	}
	
	private E findHelper(BSTNode<Key, E> node, Key k) {
		if(node == null) {
			return null;
		}
		if(node.getKey().compareTo(k) == 0) {
			return node.getElement();
		} else if(node.getKey().compareTo(k) > 0) {
			return findHelper(node.left(), k);
		} else {
		return findHelper(node.right(), k);	
		}
	}
	

	@Override
	public int size() {
		return nodeCount;
	}
	
	private StringBuffer out;
	public String toString() {
		out = new StringBuffer(100);
		printhelp(root);
		return out.toString();
	}
	private void printhelp(BSTNode<Key, E> node) {
		if(node == null) {
			return;
		}
		printhelp(node.left());
		out.append(node.getElement() + " ");
		printhelp(node.right());
	}
	
}
