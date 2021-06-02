package com.br.cursoclassesemetodos.classes;

public class Animal {

    //propriedades
    protected int tamanho;
    protected String cor;
    protected double peso;

    //Getter and Setter
    /*
    Getter: Recuperar o valor de uma propriedade
    Setter: Configura o valor de uma propriedade
     */

    //cor
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    //tamanho
    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //peso
    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }




    //método (ação)
    public void correr(){
        System.out.println("Correr como um ");
    }

    public void dormir(){
        System.out.println("Dormir como um animal");
    }


}
