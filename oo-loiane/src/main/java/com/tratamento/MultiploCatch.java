package com.tratamento;

public class MultiploCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 3, 8, 0};
		
		for(int i = 0 ; i < numeros.length ; i++) {
			
			try {
				System.out.println(numeros[i] +" / "+  demon[i] +" = "+ + (numeros[i] / demon[i]));

			} catch(ArithmeticException e1) {
				System.out.println("Erro ao dividirpor zero");
			}
			 catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("Posição do array invaldida");
			}
		}		

	}

}
