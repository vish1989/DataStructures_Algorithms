package heapsAndPriorityQueue;

public class testClass {
	
	private static void printHeap(Integer[] heap, int length) {
		for(int i = 0; i < length; i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] heap = {4, 1, 3, 2, 16, 9, 10 ,14 ,8, 7};
		
		tesetMaxHeap(heap);
		
		testHeapSort(heap);
	}

	private static void testHeapSort(Integer[] heap) {
		
		HeapSort<Integer> heapSort = new HeapSort<Integer>();
		heapSort.sort(heap);
		printHeap(heap, heap.length);
		
	}
	
	private static void tesetMaxHeap(Integer[] heap) {
		for(Integer i : heap) {
			System.out.print(i+" ");
		}
		System.out.println();

		MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(heap, 10, 10);
		printHeap(heap, maxHeap.heapLength());
		
		maxHeap.remvoeMax();
		printHeap(heap, maxHeap.heapLength());
		
		maxHeap.insert(new Integer(15));
		printHeap(heap, maxHeap.heapLength());
	}

}
