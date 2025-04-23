package Repetições;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        
        System.out.println("|| Sequência de Fibonacci ||");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para fazer a sequência: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("Tem que ser positivo!!");
        } else {
            int a = 0, b = 1;
            System.out.println("Sequência de Fibonacci:");
            for (int i = 1; i <= numero; i++) {
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;
            }
        }

        scanner.close();
    }
}
