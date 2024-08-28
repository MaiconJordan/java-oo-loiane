package com.Vetor;

public class ListaLigada {

    private Elemento primeiro;
    private Elemento  ultimo;
    private int tamanho;

    public ListaLigada(){
        this.tamanho= 0;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }
    public Elemento getUltimo() {
        return ultimo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor){
        Elemento elemento = new Elemento(novoValor);
    }

    public void remover(String novoValor){

    }

    public void get(String novoValor){

    }




    

    
    
}
