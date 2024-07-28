package com.topfive.estrutura;

public class Programa {

	public static void main(String[] args) {	
		
		Filme filme = new Filme();
		filme.setDiretorFilme("Tarantino");
		filme.setGeneroFilme("Ação");
		filme.setNomeFilme("Kill bill");
		filme.setNotaFilme(8);
		
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Maicon");
		pessoa1.setFilmes(filme);

		System.out.println(pessoa1);
		

	}

}
