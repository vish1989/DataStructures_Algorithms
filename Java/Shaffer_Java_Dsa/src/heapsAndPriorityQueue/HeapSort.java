package heapsAndPriorityQueue;

public class HeapSort<E extends Comparable<? super E>> {
	
	public void sort(E[] array){
		int length = array.length;
		MaxHeap<E> maxHeap = new MaxHeap<E>(array, length, length);
		for(int i = length - 1; i >=0 ; i--) {
			maxHeap.remvoeMax();
		}
	}
}
