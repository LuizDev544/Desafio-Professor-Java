package CondiçõesParte1;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        System.out.println("||Calculadora de multa por execesso de velocidade||");

        Scanner sc = new Scanner(System.in);

        double velocidade;
        System.out.println("Qual foi a velocidade que tu percorreu KM/H:");
        velocidade = sc.nextDouble();

        if (velocidade <= 90) {
            System.out.println("Tá d boas 👍");
        } else {
            double excesso = velocidade - 90;
            double multa = excesso * 10;
            System.out.println("-- voce ultrapassou o limite!");
            System.out.println("Sua velocidade foi de:" +velocidade);
            System.out.println("A sua multa foi de R$" +multa);
        }
        sc.close();
    }
}