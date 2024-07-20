package com.arrays;

public class Arrays {
	public static void main(String[] args) {
		double[] temperaturas = new double[365];
		
		temperaturas[0] = 33.5;
		temperaturas[1] = 30.0;
		temperaturas[2] = 29.3;
		temperaturas[3] = 15.55;
		temperaturas[4] = 10;
		
		System.out.println("Posição do array 1" + temperaturas[0]);
		System.out.println("Quando posições tem esse array " + temperaturas.length);
	}
}
