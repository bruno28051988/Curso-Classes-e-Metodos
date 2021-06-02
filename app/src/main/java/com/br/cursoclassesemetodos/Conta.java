package com.br.cursoclassesemetodos;

public class Conta {

    //propriedades
    protected int numeroConta;
    private double saldo = 100;


    //métodos (ações)
    public double recuperarSaldo(){
        return this.saldo;
    }

    public void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    public void sacar(double valorSaque){
        this.saldo = this.saldo - valorSaque;
    }


}
