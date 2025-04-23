package Exercicio1;
import java.util.Scanner;

public class Desafio1{
    public static void main(String[] args) {

        System.out.println("||Adivinhe um Número||");
        System.out.println("A máquina escolheu um numero aleatório entre 1 a 10");

        Scanner sc = new Scanner(System.in);

        int NumMaquina = (int)(Math.random()*10);
        int NumJogador;
        System.out.println("Digite um numero:");
        NumJogador =sc.nextInt();

        if (NumMaquina == NumJogador) {
            System.out.println("||Voce ganhou!!||");
            System.out.println("Esse foi seu numero: " + NumJogador);
            System.out.println("Esse foi o numero da máquina: " + NumMaquina);
        } else {
            System.out.println("||Voce Errou!!||");
            System.out.println("Esse foi seu numero: " + NumJogador);
            System.out.println("Esse foi o numero da máquina: " + NumMaquina);
        }
        sc.close();
    }
}