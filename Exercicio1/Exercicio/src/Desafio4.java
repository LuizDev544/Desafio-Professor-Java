package Exercicio4;
import java.util.Scanner;

public class Desafio4{
    public static void main(String[] args) {

        System.out.println("||Média de numeros||");
        System.out.println("--Insere numero aleatórios , quando digitar 0 vamos calcular a média--");

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double soma = 0;
        Double valor;
        
        do {
            System.out.println("Digite um Numero (0 para de rodar) aqui:");
            valor = sc.nextDouble();
            if (valor != 0) {
                soma += valor;
                contador++;
            }
        } while (valor != 0);

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("A média dos numeros digitados foi de :" + media);
        } else {
            System.err.println("Nenhum numero foi digitado");
        }

        sc.close();
    }
}