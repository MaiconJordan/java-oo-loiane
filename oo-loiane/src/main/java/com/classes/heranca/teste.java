package com.classes.heranca;

public class teste {
	
	public static void main (String[] args) {
		
	
	 Aluno aluno = new Aluno();
		
		Pessoa pessoa = new Pessoa();
		
		Pessoa professor = new Professor();
		
		
		
		aluno.setCurso("Ciencia da Computação");
		double[] notas = {10, 9, 8, 7};
		
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		
	}
}
