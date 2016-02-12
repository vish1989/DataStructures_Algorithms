package binaryTree;

public interface Dictionary<Key, E> {
/**
 * Reinitialize the dictionary
 */
	public void clear();
	
	/**
	 * 
	 * @param k key for the record being inserted
	 * @param e value for the record being inserted
	 */
	public void insert(Key k, E e);
	
	/**
	 * 
	 * @param k key for the record being removed
	 * @return
	 */
	public E remove(Key k);
	
	/**
	 * 
	 * @param k key for the record to be found
	 * @return
	 */
	public E find(Key k);
	
	/**
	 * current size of the dictionary
	 * @return
	 */
	public int size();
	
};
