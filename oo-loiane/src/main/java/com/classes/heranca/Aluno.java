package com.classes.heranca;

import java.util.Arrays;

public class Aluno extends Pessoa {

	
	private String curso;
	private double[] notas;
	
	

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	public Aluno() {
		super();		
	}
	
	public Aluno(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone, cpf);		
	}



	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verficarAprovado() {
		return true;
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do aluno: ";
		s += this.getEndereco();
		return s;
				
	}
	
}
