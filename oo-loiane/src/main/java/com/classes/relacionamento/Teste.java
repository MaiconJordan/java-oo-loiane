package com.classes.relacionamento;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		
		contato.setNome("Madara");
		
		
		
		
		
		Endereco end = new Endereco();
		
		end.setCep("9999=999");
		end.setCidade("Manaus");
		end.setComplemento("principal");
		end.setEstado("AM");
		end.setNomeRua("vinte 3");
		end.setNumero("89");
		
		contato.setEndereco(end);
		
		Telefone tel = new Telefone();
		tel.setDdd("92");
		tel.setNumero("9999-9999");
		tel.setTipo("Celular");
		
		Telefone tel2 = new Telefone();
		tel2.setDdd("45");
		tel2.setNumero("8888-8888");
		tel2.setTipo("Casa");
		
		
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		
		telefones[1] = tel2;
		
		
		contato.setTelefones(telefones);
		
		// System.out.println(contato.getNome()+" " + contato.getEndereco().getCidade() +" " + contato.getTelefone().getNumero());
		
		
		System.out.println(contato.getTelefones()[1].getNumero());
		
	}

}
