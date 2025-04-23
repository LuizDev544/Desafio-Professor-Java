package CondiçõesParte1;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        System.out.println("||Adivinhe um número||");

        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero entre 1 até 10:");
        numero = sc.nextInt();

        int NumeroMaquina = (int)(Math.random()*10);

        if (numero == NumeroMaquina) {
            System.out.println("-- voce acertou o numero!");
            System.out.println("Seu numero foi de:" +numero);
            System.out.println("A máquina escolheu" +NumeroMaquina);
        } else {
            System.out.println("-- voce errou o numero!");
            System.out.println("Seu numero foi de:" +numero);
            System.out.println("A máquina escolheu:" +NumeroMaquina);
        }
        sc.close();
    }
}