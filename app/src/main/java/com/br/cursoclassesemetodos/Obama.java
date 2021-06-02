package com.br.cursoclassesemetodos;

public class Obama extends Cidadao  implements Presidente{

    @Override
    public void ganharEleicao() {
        System.out.println("Ganhat uma eleição nos EUA");
    }
}
