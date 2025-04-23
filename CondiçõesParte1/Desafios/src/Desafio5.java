package CondiçõesParte1;
import java.util.Scanner;

public class Desafio5{
    public static void main(String[] args) {

        System.out.println("||Calculo da Taxa de empréstimo||");
        System.out.println("--Tabela de parcelas desejadas--");
        System.out.println("6 meses : +5% do valor total");
        System.out.println("12 meses : +10% do valor total");
        System.out.println("24 meses : +20% do valor total");

        Scanner sc = new Scanner(System.in);
        int Opcao;
        System.out.println("Digite uma opção mostrada na tabela:");
        Opcao = sc.nextInt();
        Double valor;
        System.out.println("Insira tambem o valor do empréstimo R$: ");
        valor = sc.nextDouble();

        switch (Opcao) {
            case 6:
                Double valortotal1 = valor * 1.05;
                System.err.println("O valor total do emprétimo foi de R$" + valortotal1);
                break;
            case 12:
                Double valortotal2 = valor * 1.10;
                System.err.println("O valor total do emprétimo foi de R$" + valortotal2);

            case 24:
                Double valortotal3 = valor * 1.20;
                System.err.println("O valor total do emprétimo foi de R$" + valortotal3);

            default:
                break;
        }

        sc.close();
    }
}