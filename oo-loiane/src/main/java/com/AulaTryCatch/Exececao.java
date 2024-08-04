package com.AulaTryCatch;

import java.util.Vector;

public class Exececao {
	public static void main(String[] args) {
		
		int[] vetro = new int[4];
		
		
		try {
			
			System.out.println("print antes do erro");
			
			vetro[4] = 1;
			
			System.out.println("Esse texto nao sera impresso");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de indice ");
		}		
			
		System.out.println("Programa continuando");
		
		
		
		

		
		
		
	}

}
