package com.estruturadedados.teste;

import com.estruturadedados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(3);
		
		try {
			vetor.adiciona("elemento 1");
			
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
