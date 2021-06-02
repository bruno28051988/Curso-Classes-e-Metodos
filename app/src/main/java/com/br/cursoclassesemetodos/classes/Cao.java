package com.br.cursoclassesemetodos.classes;

public class Cao extends Animal{

    //propriedades

    //métodos (ação)
   public void latir(){
        System.out.println("Latir com um cão");
    }

    public void correr(){
       super.correr();
        System.out.println("Cão");

        
    }


}
