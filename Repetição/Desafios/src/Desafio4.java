package Repetições;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int somaPares = 0, somaImpares = 0;

        System.out.print("Digite um número (0 para sair): ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("Número par.");
                somaPares += numero;
            } else {
                System.out.println("Número ímpar.");
                somaImpares += numero;
            }

            System.out.print("Digite outro número (0 para sair): ");
            numero = sc.nextInt();
        }

        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);

        sc.close();
    }
}

