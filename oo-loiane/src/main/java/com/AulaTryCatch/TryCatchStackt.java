package com.AulaTryCatch;

public class TryCatchStackt {
	public static void main(String[] args) {
		
		int[] numeros1 = {2, 4, 8, 16, 32, 64};
		int[] numeros2 = {2, 0, 4, 0, 8};
		
		for(int i = 0; i < numeros1.length; i++) {
			
			try {
				System.out.println(numeros1[i] + " / " + numeros2[i] + " = " + (numeros1[i] / numeros2[i]));
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
	}

}
