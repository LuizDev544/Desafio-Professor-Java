package Exercicio2;
import java.util.List;
import java.util.ArrayList;

public class Desafio3 {
    public static void main(String[] args) {
        System.out.println("||Verificar eleementos duplicados||");

        List<Integer> ListaDeNumeros = new ArrayList<>();

        ListaDeNumeros.add(22);
        ListaDeNumeros.add(7);
        ListaDeNumeros.add(45);
        ListaDeNumeros.add(23);
        ListaDeNumeros.add(66);

        System.out.println("Lista dos Numeros:" + ListaDeNumeros);

        List<Integer> ListaDeNumerosPares = new ArrayList<>();
        List<Integer> ListaDeNumerosImpares = new ArrayList<>();
        
        for (int numero : ListaDeNumeros) {
            if (numero % 2 == 0) {
                ListaDeNumerosPares.add(numero);
            }else{
                ListaDeNumerosImpares.add(numero);
            }
        }

        System.out.println("Nuemros pares:" + ListaDeNumerosPares);
        System.out.println("Nuemros Impares:" + ListaDeNumerosImpares);
        }
}
