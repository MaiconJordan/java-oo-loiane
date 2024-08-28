package com.carro;

public class Carro {
	
	
	String marca;
	 String tipo;
	 String combustivel;
	 int anoModelo;
	 int anoAtual = 2024;
	
	 
	// Metodo Simples
	public void informarcoesCarro() {
		System.out.println(marca + " " + tipo + " " + combustivel + " " + anoModelo);
	}
	
	
	//Metodo com Retorno
	int anoDeUso () {
		return anoAtual - anoModelo;		
	}
	
	//Metodo com Argumento
	String orcamentoDaOferta(double oferta) {
		int valor = anoDeUso() * 1000;
		String resultado;
		if (oferta > valor) {
			 String ofertaAceita = "Oferta Aceita ";	
			 resultado = ofertaAceita;
		} else {
			 String ofertaRecusada = "Oferta recusada o valor minimo é de: " + valor; 
			  resultado = ofertaRecusada;
			
		}	
		
		return resultado;
	}

}
