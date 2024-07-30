package com.topfive.estrutura;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {	
		
	Scanner sc = new Scanner(System.in);
	
	Filme filme = new Filme();
	
	System.out.print("Informe o Genero do Filme: \n");
    filme.setGeneroFilme(sc.nextLine()); 
    
    System.out.print("Informe o Nome do Filme: \n");
    filme.setNomeFilme(sc.nextLine()); 
    
    System.out.print("Informe o Nome do Diretor do Filme: \n");
    filme.setDiretorFilme(sc.nextLine());
    
    System.out.print("Informe a nota do Filme: \n");
    filme.setNotaFilme(sc.nextInt());
	
    System.out.println(filme);
	
	
	
	
	
	
	
	sc.close();
		

	}

}
