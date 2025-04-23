package Repetições;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numero, soma = 0, contador = 0;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
            if (numero != 0) {
                soma += numero;
                contador++;
            }
        } while (numero != 0);

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Média dos números digitados: " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        scanner.close();
    }
}
