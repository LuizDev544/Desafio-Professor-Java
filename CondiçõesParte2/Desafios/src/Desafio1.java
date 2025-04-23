package CondiçõesParte2;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        System.out.println("||Verificação de um triângulo válido||");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado (A) do triângulo:");
        int Opcao1 = sc.nextInt();

        System.out.println("Digite o lado (B) do triângulo:");
        int Opcao2 = sc.nextInt();

        System.out.println("Digite o lado (C) do triângulo:");
        int Opcao3 = sc.nextInt();

        if (Opcao1 + Opcao2 > Opcao3 && 
            Opcao1 + Opcao3 > Opcao2 && 
            Opcao2 + Opcao3 > Opcao1) {
            System.out.println("-- A opção é válida para se tornar um triângulo");
        } else {
            System.out.println("-- Os valores não formam um triângulo válido");
        }

        sc.close();
    }
}
