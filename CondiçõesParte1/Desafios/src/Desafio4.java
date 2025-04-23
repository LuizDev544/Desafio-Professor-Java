package CondiçõesParte1;
import java.util.Scanner;

public class Desafio4{
    public static void main(String[] args) {

        System.out.println("||Conversor de Moedas||");
        System.out.println("--Tabela de valores de reais para dolares--");
        System.out.println("1-Dólar (R$1 = US$0.20)");
        System.out.println("2-Euro (R$1 = 0.18)");
        System.out.println("3-Libra (R$1 = 0.15)");

        Scanner sc = new Scanner(System.in);
        int Opcao;
        System.out.println("Digite uma opção mostrada na tabela:");
        Opcao = sc.nextInt();
        Double valor;
        System.out.println("Insira tambem o valor para ser convertido R$: ");
        valor = sc.nextDouble();

        switch (Opcao) {
            case 1:
                Double conversao1 = valor * 0.20;
                System.err.println("O valor convertido foi de:" + conversao1);
                break;
            case 2:
                Double conversao2 = valor * 0.18;
                System.err.println("O valor convertido foi de:" + conversao2);
            case 3:
                Double conversao3 = valor * 0.15;
                System.err.println("O valor convertido foi de:" + conversao3);
            default:
                break;
        }

        sc.close();
    }
}