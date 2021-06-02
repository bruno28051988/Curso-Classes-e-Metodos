package com.br.cursoclassesemetodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.br.cursoclassesemetodos.classes.Animal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Obama obama = new Obama();
        obama.direitosDeveres();
        obama.ganharEleicao();



         /*
        ContaBancaria conta = new ContaBancaria();
        */

        /*
        Pessoa pessoa = new Pessoa();
        pessoa.exibirDados("Bruno", 32);
        pessoa.exibirDados("Patricia");
        */

        /*
        Conta conta = new Conta();
        conta.depositar(100); // Agora meu saldo é de 200
        conta.sacar(50); // Agora meu saldo é de 150
        System.out.println(conta.recuperarSaldo());
        */


       /*
       Passaro passaro = new Passaro();
        passaro.correr();

        Cao cao = new Cao();
        cao.correr();
        */

       // cao.setCor("Azul");
       //System.out.println(cao.getCor());




        /*
        Passaro passaro = new Passaro();
        passaro.correr();
        passaro.dormir();
        passaro.voar();
        */

        /*
        Cao cao = new Cao();
        cao.dormir();
        cao.latir();
        */

        /*
        Animal animal = new Animal();
        animal.correr();
        */






        /*
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Bruno";
        funcionario.salario = 920;

        double salarioRecuperado = funcionario.recuperarSalario(150, 50 );
        System.out.println("O sálario é: " + salarioRecuperado);
        */





        //int numero = 10;  Casa seria igual (int, float, String)
        /*Casa minhaCasa = new Casa();

        minhaCasa.cor = "Azul";

        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta(); */


    }
}