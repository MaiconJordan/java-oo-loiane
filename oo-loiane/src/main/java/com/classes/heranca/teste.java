package com.classes.heranca;

public class teste {
	
	public static void main (String[] args) {
		
	
	 Pessoa pessoa = new Pessoa();
	 Aluno aluno = new Aluno();
	 Professor prof = new Professor();
	 
	 if(prof instanceof Professor) {
		
		System.out.println("É do tipo Professor");
	}
	if(aluno instanceof Aluno) {
			
			System.out.println("É do tipo Aluno");
	}
	if(pessoa instanceof Pessoa) {
			
			System.out.println("É do tipo Pessoa");
	}
}

}