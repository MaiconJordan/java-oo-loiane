package com.arrays;

public class Exe01 {

	public static void main(String[] args) {

		Integer[] A = new Integer[5];	
		
		A[0] = 10;
		A[1] = 20;
		A[2] = 30;
		A[3] = 40;
		A[4] = 50;
		
		Integer[] B = new Integer[5];
		
		for(int i = 0 ; i < A.length ; i++) {
			B[i] = A[i];
		}
		
		for(int b : B) {
			System.out.println(b);
		}
		
	}

}
