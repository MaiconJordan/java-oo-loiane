package com.topfive.estrutura;

public class Programa {

	public static void main(String[] args) {	
		
		Filme filme = new Filme();
		filme.setNomeFilme("Gladiador");
		filme.setDiretorFilme("Martin Scoseze");
		filme.setGeneroFilme("Ação");
		filme.setNotaFilme(10);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Maicon");
		pessoa1.setFilmes(filme);

		System.out.println(pessoa1.getFilmes().getDiretorFilme());
		

	}

}
