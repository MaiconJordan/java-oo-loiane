package com.arrays;
import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de notas que você irá lançar: ");
		int n = sc.nextInt();

		double[] notas = new double[n];

		for(int i = 0; i < n; i++){
			System.out.println("Digite a " + i + 1 +"º " + "do aluno" );
			int nota = sc.nextInt();
			notas[i] = nota;
		}

		double soma = 0;
		for(double no: notas){
			soma += no;
		}

		System.out.println(soma / n);






		sc.close();
	}


}
