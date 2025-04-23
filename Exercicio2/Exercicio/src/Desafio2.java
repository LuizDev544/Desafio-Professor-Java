package Exercicio8;
import java.util.List;
import java.util.ArrayList;


public class Desafio2 {
    public static void main(String[] args) {

        System.out.println("||Soma e Média dos Numeros||");

        List<Integer> ListaDeNumeros = new ArrayList<>();

        ListaDeNumeros.add(1);
        ListaDeNumeros.add(2);
        ListaDeNumeros.add(3);
        ListaDeNumeros.add(4);
        ListaDeNumeros.add(5);

        int tamanho = ListaDeNumeros.size();
        int media , soma = 0;

        for (int Numeros : ListaDeNumeros) {
            soma += Numeros;
        }

        media = soma / tamanho;

        System.out.println("Lista de numeros:" + ListaDeNumeros);
        System.out.println("Soma:" + soma);
        System.out.println("Média dos numeros:" + media);

    }
}
