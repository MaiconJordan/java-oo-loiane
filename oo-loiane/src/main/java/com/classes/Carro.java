package com.classes;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + obterAutonomia() + " km");
		
	}
	
	double obterAutonomia() {
		
		return capCombustivel * consumoCombustivel;
	}
}
