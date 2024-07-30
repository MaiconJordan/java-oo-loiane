package com.topfive.estrutura;

public class Pessoa {
	
	
	private String nome;
	private Filme[] filmes;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Filme[] getFilmes() {
		return filmes;
	}
	public void setFilmes(Filme[] filmes) {
		this.filmes = filmes;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", filmes=" + filmes + "]";
	}
	
	
	
	

}
