package com.br.cursoclassesemetodos;

public class Bruno extends Cidadao implements Presidente{

    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleição no Brasil");
    }
}
