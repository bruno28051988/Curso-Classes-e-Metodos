package com.br.cursoclassesemetodos.classes;

public class Passaro extends Animal {

    //propriedades

    //métodos (ação)
    public void voar(){
        System.out.println("Voando igual um passaro");
    }

    public void correr(){
        super.correr();
        System.out.println("Passaro");
    }
}
