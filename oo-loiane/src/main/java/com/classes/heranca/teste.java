package com.classes.heranca;

public class teste {
	
	public static void main (String[] args) {
		
	
		Pessoa aluno = new Aluno();
		
		Pessoa pessoa = new Pessoa();
		
		Pessoa professor = new Professor();
		
		
		
		pessoa.setEndereco("Rua 1, num 3");
		aluno.setEndereco("Rua 2, num 3");
		professor.setEndereco("Rua 3, num 3");
	

		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
		
	}
}
