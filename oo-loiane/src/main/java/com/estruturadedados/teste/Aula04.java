package com.estruturadedados.teste;

import com.estruturadedados.vetor.Vetor;

public class Aula04 {

    public static void main(String[] args) {

		Vetor vetor = new Vetor(10);
		
		try {
			vetor.adiciona("elemento 1");
			
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
			vetor.adiciona("elemento 4");
			vetor.adiciona("elemento 5");
		} catch (Exception e) {
			e.printStackTrace();
		}

        System.out.println(vetor);
        
		
		
		
		
	}

    
}
