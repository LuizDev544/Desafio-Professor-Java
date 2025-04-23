package Repetições;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        int soma = 0;

        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }

        System.out.println("Soma dos dígitos: " + soma);

        sc.close();
    }
}

