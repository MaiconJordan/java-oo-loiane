package com.matrizes;

public class Matriz {

	public static void main(String[] args) {
	
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7.5;
		notasAlunos[0][2]= 6;
		notasAlunos[0][3] = 9;
		
		notasAlunos[1][0] = 10;
		notasAlunos[1][1] = 5.5;
		notasAlunos[1][2]= 6.5;
		notasAlunos[1][3] = 7;
		
		notasAlunos[2][0] = 7;
		notasAlunos[2][1] = 9.5;
		notasAlunos[2][2]= 7;
		notasAlunos[2][3] = 5;
		
		for(int i =0 ; i < notasAlunos.length ; i ++) {
			for( int j = 0 ; j < notasAlunos[i].length ; j++ ) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		
		
	}

}
