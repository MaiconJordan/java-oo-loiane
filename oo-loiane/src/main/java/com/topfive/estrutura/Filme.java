package com.topfive.estrutura;

public  class Filme  {
	
	private String nomeFilme;
	private String generoFilme;
	private String diretorFilme;
	private double notaFilme;
	
	/**
	 * 
	 */
	public Filme() {}
	
	
	public Filme(String nomeFilme, String generoFilme, String diretorFilme, double notaFilme) {		
		this.nomeFilme = nomeFilme;
		this.generoFilme = generoFilme;
		this.diretorFilme = diretorFilme;
		this.notaFilme = notaFilme;

	}
	
	
	public String classificacaoFilme() {		
		if (this.getNotaFilme() >= 7) {
			return "Bom";
		}
		else if (this.getNotaFilme() < 7 || this.getNotaFilme() >= 4) {
			return "Médio";
		}
		return "Ruim";
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


	public double getNotaFilme() {
		return notaFilme;
	}


	public void setNotaFilme(int notaFilme) {
		this.notaFilme = notaFilme;
	}


	@Override
	public String toString() {
		return "Filme [nomeFilme=" + nomeFilme + ", generoFilme=" + generoFilme + ", diretorFilme=" + diretorFilme
				+ ", notaFilme=" + notaFilme + "]";
	}	
	
	
	
	//comentario

}
