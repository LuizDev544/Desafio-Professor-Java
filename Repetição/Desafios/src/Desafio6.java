package Repetições;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 100) + 1;
        int tentativa;

        System.out.println("Adivinhe o número secreto entre 1 e 100!");

        System.out.print("Digite sua tentativa: ");
        tentativa = sc.nextInt();

        while (tentativa != numeroSecreto) {
            if (tentativa < numeroSecreto) {
                System.out.println("Maior!");
            } else {
                System.out.println("Menor!");
            }
            System.out.print("Tente novamente: ");
            tentativa = sc.nextInt();
        }

        System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);

        sc.close();
    }
}

