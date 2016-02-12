package tests;

import java.util.Scanner;

public class fibonacci {

	static final int FIB_MAX = 10000;
	
	static  long[] fibA = new long[FIB_MAX]; 
	
	private static long Fib(int n) {
		
		if(fibA[n] != 0) {
			return fibA[n];
		}
		
		if (n==0){
			fibA[n] = 0;
			return fibA[n];
		}
		else if (n==1){
			fibA[n] = 1;
			return fibA[n];
		}
		else {
			fibA[n] = Fib(n-1) + Fib(n-2);
			return fibA[n];
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the nuber");
		int n = Integer.valueOf(scr.nextLine());
		System.out.println("Fib number is "+ String.valueOf(Fib(n)));
		
	}
	
}
