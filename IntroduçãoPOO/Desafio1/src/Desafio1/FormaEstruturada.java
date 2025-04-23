package Desafio1;
import java.util.Scanner;

public class FormaEstruturada {
    public static void main(String[] args) {
        System.out.println("||Calculando de Média Aluno||");

        Scanner sc = new Scanner(System.in);

        Double nota1;
        System.out.println("Insira a sua primeira nota: ");
        nota1 = sc.nextDouble();

        Double nota2;
        System.out.println("Insira a sua segunda nota: ");
        nota2 = sc.nextDouble();

        Double nota3;
        System.out.println("Insira a sua terceira nota: ");
        nota3 = sc.nextDouble();

        Double media = (nota1+ nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Voce passou !");
        } else {
            System.out.println("Voce reprovou ;-; ");
        }

        sc.close();
    }
}