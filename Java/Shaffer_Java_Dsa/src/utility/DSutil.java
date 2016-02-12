package utility;

import java.util.Random;


public class DSutil<E>{
	
	/**
	 * swaps elements in an array.
	 * @param eArray
	 * @param p1
	 * @param p2
	 */
	public static <E> void swap(E[] eArray, int p1, int p2) {
		E temp = eArray[p1];
		eArray[p1] = eArray[p2];
		eArray[p2] = temp;
	}
	
	/**
	 * permutes the array.
	 * @param A
	 */
	public static <E> void permute(E[] A) {
		for(int i = 0; i < A.length; i++) {
			swap(A, i, DSutil.random(i));
		}
	}
	
	/**
	 * swapping two numbers at positions p1 and p2
	 * @param A
	 * @param p1
	 * @param p2
	 */
	public static void swap(int[] A, int p1, int p2) {
		int temp = A[p1];
		A[p1] = A[p2];
		A[p2] = temp;
	}
	
	public  static void permute(int[] A) {
		for(int i = 0; i < A.length; i++) {
			swap(A, i, DSutil.random(i));
		}
	}
	
	/**
	 * generates random number.
	 */
	static private Random random = new Random();
	
	private static int random(int n) {
		return Math.abs(random.nextInt()) % n;
	}


}
