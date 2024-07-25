package com.topfive.estrutura;

public class Programa {

	public static void main(String[] args) {

		Filme filmeum = new Filme("Era do Gelo", "Animação", "Steve Martino", 7);
		
		System.out.println(filmeum.getNomeFilme());
		
		System.out.println(filmeum.classificacaoFilme());

	}

}
