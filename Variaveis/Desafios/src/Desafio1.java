package Variaveis;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        System.out.println("||Conversão de temperatura||");
        System.out.println("--Conversão de C para F e K --");

        Scanner sc = new Scanner(System.in);

        double Celcius;
        System.out.println("Informe o numero de graus Celcius para conversão:");
        Celcius = sc.nextDouble();

        double F = (Celcius * 1.8) + 32;
        double K = Celcius + 273.15;

        System.out.println("A conversão para Kelvin foi de: " + K );
        System.out.println("A conversão para Farenheit foi de: " + F );

        sc.close();
    }
}