package CondiçõesParte2;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

        System.out.println("||Calculadora de Segura de Automóveis||");

        System.out.println("--Para homens com menos de 25 anos e menos de 2 anos de experiência: R$ 2000.");
        System.out.println("--Para mulheres com menos de 25 anos e menos de 2 anos de experiência: R$ 1800.​");
        System.out.println("--Para motoristas com mais de 25 anos ou mais de 2 anos de experiência: R$ 1200.​");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();

        System.out.println("Agora coloque o seu sexo:");
        String sexo = sc.nextLine();

        System.out.println("Por fim , digite o seus anos de experiencia como motorista:");
        int anos = sc.nextInt();

        if (idade < 25 && sexo == "homen" && anos <2) {

            System.out.println("O seu seguro foi de R$2000");

        } else if(idade < 25 && sexo == "mulher" && anos <2) {
            
            System.out.println("O seu seguro foi de R$1800");

        }else if(idade >25 || anos >= 2){

            System.out.println("O seu seguro foi de R$1200");

        }else{
            System.out.println("num tem essa opção");
        }

        sc.close();
    }
}
