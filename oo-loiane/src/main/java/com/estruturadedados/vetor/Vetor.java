package com.estruturadedados.vetor;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	/*public void adiciona(String elemento) {
		for(int  i= 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	} */
	
	public void adiciona(String elemento) throws Exception {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor ja está cheio");
		}			
	}

	
	public int tamanho(){
		return this.tamanho;
	}

	public String toString(){
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i <this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}

		s.append("]");

		return s.toString();
	}

}
