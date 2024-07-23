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

}
