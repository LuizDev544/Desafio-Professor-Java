package CondiçõesParte2;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        System.out.println("||Classificação de triângulo||");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado (A) do triângulo:");
        int Opcao1 = sc.nextInt();

        System.out.println("Digite o lado (B) do triângulo:");
        int Opcao2 = sc.nextInt();

        System.out.println("Digite o lado (C) do triângulo:");
        int Opcao3 = sc.nextInt();

        if (Opcao1 + Opcao2 > Opcao3 && Opcao1 + Opcao3 > Opcao2 && Opcao2 + Opcao3 > Opcao1) {
            if (Opcao1 == Opcao2 && Opcao2 == Opcao3) {
                System.out.println("-- É um triângulo Equilátero.");
            } else if (Opcao1 == Opcao2 || Opcao1 == Opcao3 || Opcao2 == Opcao3) {
                System.out.println("-- É um triângulo Isósceles.");
            } else {
                System.out.println("-- É um triângulo Escaleno.");
            }
        } else {
            System.out.println("-- Os lados fornecidos não formam um triângulo válido.");
        }

        sc.close();
    }
}
