package heapsAndPriorityQueue;

import java.lang.Comparable;

import utility.DSutil;

public class MaxHeap<E extends Comparable<? super E>>{

	private E[] heap;
	private int maxSize;
	private int length;
	
	MaxHeap(E[] heap, int maxSize, int length) {
		this.heap = heap;
		this.maxSize = maxSize;
		this.length = length;
		buildHeap();
	}
	
	/**
	 * returns the size of the heap
	 * @return
	 */
	public int heapSize() {
		return maxSize;
	}
	
	/**
	 * returns the current length of the heap.
	 * @return
	 */
	public int heapLength() {
		return length;
	}
	
	
	/**
	 * returns the leftchild position of the heap
	 * @param pos
	 * @return
	 */
	
	public int leftChild(int pos) {
		assert 2 * pos +1 < length : "pos has no left child";
		return 2 * pos + 1;
	}
	
	/**
	 * returns the right child position of the heap
	 * @param pos
	 * @return
	 */
	public int rightChild(int pos) {
		assert 2 * pos + 2 < length : "pos has no right child";
		return 2 *  pos + 2;
	}
	
	/**
	 * returns the parents position
	 * @param pos
	 * @return
	 */
	public int parent(int pos){
		assert pos > 0 : "Position has no parent";
		return (pos-1) / 2;
	}
	
	public boolean isLeaf(int pos) {
		return (length > pos) && (pos > length/2); 
	}
	
	
	/**
	 * builds the heap
	 * @param heap
	 * @param length
	 */
	private void buildHeap() {
		int pos = parent(length-1);
		for (int j = pos; j >= 0; j--) {
			heapify(heap, j);
		}
	}
	
	/**
	 * assumes that left and right child of heap is balanced
	 * and imbalanced at pos
	 * @param heap
	 * @param pos
	 */
	private void heapify(E[] heap, int pos){
		
		assert pos > 0 && pos < length : "illegal address";
		
		if(isLeaf(pos)) {
			return;
		}
		
		int left = leftChild(pos);
		int right = rightChild(pos);
		int greatest = pos;
		if(left < length && (heap[greatest].compareTo(heap[left]) < 0)){
			greatest = left;
		}
		
		if(right < length && (heap[greatest].compareTo(heap[right]) < 0)) {
			greatest = right;
		}
		
		if(pos != greatest) {
			DSutil.swap(heap, greatest, pos);
			heapify(heap, greatest);
		} else {
			return;
		}
		
	
	}
	
	public E heapMax() {
		if (length > 0) {
			return heap[0];
		} else {
			return null;
		}
	}
	
	public E remvoeMax() {
		if(length == 0) {
			return null;
		} else if (length == 1) {
			length = 0;
			return heap[0];
		} else {
			E temp = heap[0];
			DSutil.swap(heap, 0,  length-1);
			length--;
			heapify(heap, 0);
			return temp;
		}
	}
	
	public void insert(E elem) {
		assert length < maxSize : "Heap is full";
		length++;
		heap[length-1] = elem;
		int currIndex = length - 1;
		
		while( currIndex >= 0) {
			int parentIndex = parent(currIndex);
			if(parentIndex >=0 && (heap[currIndex].compareTo(heap[parentIndex]) > 0)) {
				DSutil.swap(heap, parentIndex,  currIndex);
				currIndex = parentIndex;
			} else {
				break;
			}
		}
	}
	
	
}
