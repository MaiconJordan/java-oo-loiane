package com.topfive.estrutura;

public class Filme {
	
	private String nomeFilme;
	private String generoFilme;
	private String diretorFilme;
	private int notaFilme;
	
	
	public Filme(String nomeFilme, String generoFilme, String diretorFilme, int notaFilme) {
		super();
		this.nomeFilme = nomeFilme;
		this.generoFilme = generoFilme;
		this.diretorFilme = diretorFilme;
		this.notaFilme = notaFilme;
	}


	public String getNomeFilme() {
		return nomeFilme;
	}


	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}


	public String getGeneroFilme() {
		return generoFilme;
	}


	public void setGeneroFilme(String generoFilme) {
		this.generoFilme = generoFilme;
	}


	public String getDiretorFilme() {
		return diretorFilme;
	}


	public void setDiretorFilme(String diretorFilme) {
		this.diretorFilme = diretorFilme;
	}


	public int getNotaFilme() {
		return notaFilme;
	}


	public void setNotaFilme(int notaFilme) {
		this.notaFilme = notaFilme;
	}
	
	
	
	
	
	
	
	
	

}
