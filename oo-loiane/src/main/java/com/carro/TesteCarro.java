package com.carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.marca = "VW";
		carro1.tipo = "Hatch";
		carro1.combustivel = "Gasolina";
		carro1.anoModelo = 1998;
		
		
		// Metodo Simples
		carro1.informarcoesCarro();
		
		int anoDeUsoDoCarro = carro1.anoDeUso();
		
		System.out.println(anoDeUsoDoCarro);
		
		System.out.println(carro1.orcamentoDaOferta(100000000));
		
		
		
		

	}

}
