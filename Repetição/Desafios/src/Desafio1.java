package Repetições;
import java.util.Scanner;
public class Desafio1 {
        public static void main(String[] args) {
        
        System.out.println("|| Fatorial de Numero||");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para fazer a fatoração: ");
        int Numero = scanner.nextInt();
        
        if (Numero <= 0) {
            System.out.println("Tem que ser positivo!!");
        } else {
            int Fatorial = 1;
            for ( int i = 1 ; i <= Numero ; i++){
                Fatorial *= i;
                System.out.println("O fatorial de " + Numero + "! é igual a:" + Fatorial);
            }
        }

        scanner.close();
    }
}
