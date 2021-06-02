package com.br.cursoclassesemetodos;

public class Pessoa {

    //propriedades
    private String nome;
    private int idade;


    //métodos (ações)
    public void exibirDados(String nome){
        System.out.println("Exibir apenas nome: " + nome);
    }

    public void exibirDados(String nome, int idade){
        System.out.println("Nome: " + nome + ". Idade: " + idade);
    }
}
