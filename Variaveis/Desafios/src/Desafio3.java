package Variaveis;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        System.out.println("||Média Final do Aluno||");

        Scanner sc = new Scanner(System.in);

        double nota1;
        System.out.println("Insira a primeira nota:");
        nota1 = sc.nextDouble();
        double nota2;
        System.out.println("Insira a segunda nota:");
        nota2 = sc.nextDouble();
        double nota3;
        System.out.println("Insira a terceira nota:");
        nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        System.out.println("A média final do aluno foi de: "+ media);

        sc.close();
    }
}