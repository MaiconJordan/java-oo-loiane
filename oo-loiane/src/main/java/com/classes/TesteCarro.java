package com.classes;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro("Fiat", "Ducato", 10, 100, 0.2);
		
		 
		van.exibirAutonomia();
		
		System.out.println( van.calcularCombustivel(10));
		
		
		
		
	}

}
