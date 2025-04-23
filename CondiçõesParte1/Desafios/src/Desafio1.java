package CondiçõesParte1;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        System.out.println("||Sistemas de notas DETALHADo||");

        Scanner sc = new Scanner(System.in);

        double Nota;
        System.out.println("Qual foi a sua média:");
        Nota = sc.nextDouble();

        if (Nota < 5) {
            System.out.println("Reprovado - Precisa melhorar muito");
        } else if(Nota >= 5){
            System.out.println("Recuperação - dedicação é nescessária!");
        } else if (Nota <= 6.9){
            System.out.println("Recuperação - dedição é nescessária");
        } else if (Nota >= 7){
            System.out.println("Aprovado - desempenho satisfatório");
        }else if (Nota <= 9){
            System.out.println("Aprovado - desempenho satisfatório");
        }else{
            System.out.println("Aprovado com distinção - execelente!");
        }
        sc.close();
    }
}