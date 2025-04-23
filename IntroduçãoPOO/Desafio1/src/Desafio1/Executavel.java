package Desafio1;

import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| calculando media do aluno||");

        Media Aluno1 = new Media(); 

        System.out.println("Digite a primeira nota do aluno:");
        Aluno1.Nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        Aluno1.Nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota do aluno:");
        Aluno1.Nota3 = sc.nextDouble();

        double mediaFinal = Aluno1.MediaAluno();

        if (mediaFinal >= 7) {
            System.out.println("Foi aprovado , a sua media foi de: " + mediaFinal);
        } else {
            System.out.println("Foi reprovado , a sua media foi de: " + mediaFinal);
        }
        sc.close();
    }
}
