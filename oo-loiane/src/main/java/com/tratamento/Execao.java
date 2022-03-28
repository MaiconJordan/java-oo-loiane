package com.tratamento;

public class Execao {
	
	public static void main(String[] args) {
		
		try {
		
		int[] vetor = new int[4];
		
		System.out.println("Antes da Exception");
		
		vetor[4] = 1;
		
		System.out.println("Esse texto n�o ser� impresso");
		
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Excessao ao acessar um indice do vetor que nao existe");
		}
		
		System.out.println("Esse texto ser� impresso ap�s a exception");

	}

}
