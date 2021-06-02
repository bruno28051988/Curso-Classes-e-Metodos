package com.br.cursoclassesemetodos;

public class Funcionario {

    //propriedades
    String nome;
    double salario;

    //métodos
    public double recuperarSalario(double bonus, double descontoAdicional){
        this.salario = this.salario - (this.salario * 0.1);
        return this.salario + bonus - descontoAdicional;
    }
}


