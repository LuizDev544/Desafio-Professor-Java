package CondiçõesParte2;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {

        System.out.println("||Sistemas de descontos||");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valor = sc.nextDouble();

        System.out.println("Qual foi a quantidade de itens que vc pegou?");
        int itens = sc.nextInt();

        if (valor > 300 || itens > 3) {

            System.out.println("-- Voce ganhou um desconto de 5% !!");
            double desconto1 = valor - (5/100);
            System.out.println("Esse foi o valor com o desconto R$"+desconto1);
        
        } else if(valor > 500 || itens >5) {

            System.out.println("-- Voce ganhou um desconto de 10% !!");
            double desconto2 = valor - (10/100);
            System.out.println("Esse foi o valor com o desconto R$"+desconto2);
        
        }else if(valor > 1000){

            System.out.println("-- Voce ganhou um desconto de 20% !!");
            double desconto3 = valor - (20/100);
            System.out.println("Esse foi o valor com o desconto R$"+desconto3);

        }else{
            System.out.println("num tem desconto");
        }

        sc.close();
    }
}
