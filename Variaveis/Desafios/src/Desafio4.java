package Variaveis;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        System.out.println("||Calculando Juros Simples||");

        Scanner sc = new Scanner(System.in);

        double CapitalInicial;
        System.out.println("Informe para o programa a capital inicial R$:");
        CapitalInicial = sc.nextDouble();

        Double Juros;
        System.out.println("Insira o % de juros ao mes :");
        Juros = sc.nextDouble();

        int mes;
        System.out.println("Por fim , insira a quantidade de meses:");
        mes = sc.nextInt();

        Double MontanteFinal = CapitalInicial * Juros * mes;

        System.out.println("O motante final foi de R$: "+ MontanteFinal);

        sc.close();
    }
}