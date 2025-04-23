package Variaveis;
import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        System.out.println("||Calculando a area e o perimetro de um Circulo||");

        Scanner sc = new Scanner(System.in);

        Double raio;
        System.out.println("Insira o raio de um circulo: ");
        raio = sc.nextDouble();

        Double area = 3.14 * Math.pow(raio,2);
        Double perimetro =2* 3.14 * raio;
        
        System.out.println("O perimetro é de: " + perimetro);
        System.out.println("A area é de: " + area);

        sc.close();
    }
}