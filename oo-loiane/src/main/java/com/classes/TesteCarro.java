package com.classes;



public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro("Fiat", "Ducato", 10, 100, 0.2);
		
		Carro saveiro = new Carro();
		
		saveiro.setMarca("Volkswagen");
		saveiro.setModelo("Saveiro");
		saveiro.setNumPassageiros(2);
		saveiro.setCapCombustivel(120);
		saveiro.setConsumoCombustivel(0.3);
		
		 
		van.exibirAutonomia();
		
		System.out.println( van.calcularCombustivel(10));
		
		
		
		
	}

}
