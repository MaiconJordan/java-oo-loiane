package com.Vetor;

public class EstadosBrasileiros {
    public static void main(String[] args) {
        // Vetor para armazenar as siglas dos estados brasileiros
        String[] estados = {
            "AC", "AL", "AP", "AM", "BA", "CE",
            "DF", "ES", "GO", "MA", "MT", "MS",
            "MG", "PA", "PB", "PR", "PE", "PI",
            "RJ", "RN", "RS", "RO", "RR", "SC",
            "SP", "SE", "TO"
        };

        // Imprimindo as siglas
        for (String sigla : estados) {
            System.out.println(sigla);
        }
    }
}