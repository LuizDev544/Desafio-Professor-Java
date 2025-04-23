package Exercicio4;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int somaPares = 0;
        int somaImpares = 0;

        
        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();

        
            if (numero == 0) {
                break;
            }


            if (numero % 2 == 0) {
                System.out.println("Número par!");
                somaPares += numero;
            } else {
                System.out.println("Número ímpar!");
                somaImpares += numero;
            }
        }


        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        scanner.close();
    }
}
