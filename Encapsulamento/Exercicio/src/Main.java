package Exercicio7;

import Exercicio7.ContaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaBancaria joao = new ContaBancaria("joão",1000);
        //Acessando o atributo
        //System.out.println(joao.saldo);
        //Alterando o atributo
        //joao.saldo = 3000;

        // acessando o atributo//
        
        System.out.println("Titular:" +joao.getTitular());
        System.out.println("Saldo:" + joao.getSaldo());

        //alterando o atributo privado//

        joao.setTitular(("João Vampeta"));

        // metodo depositar
        joao.depositar(500);
        joao.depositar(1000);
        joao.depositar(-50);

        // metodo sacar
        joao.sacar(700);

        System.out.println(joao.toString());
    }
}
