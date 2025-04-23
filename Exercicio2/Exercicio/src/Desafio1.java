package Exercicio2;
import java.util.List;
import java.util.ArrayList;

public class Desafio1 {
    public static void main(String[] args) {

        System.out.println("||criação de uma lista com nomes e filtragem personalizada||");

        List<String> ListaDeNomes = new ArrayList<>();

        ListaDeNomes.add("Pedro");
        ListaDeNomes.add("Carol");
        ListaDeNomes.add("Carolina");
        ListaDeNomes.add("Henrique");
        ListaDeNomes.add("Luiz");

        System.out.println("Lista dos nomes: " + ListaDeNomes);

        char letra = 'C';

        List<String> NomesFiltrados = new ArrayList<>();

        for (String nome : ListaDeNomes) {
            if (nome.startsWith(String.valueOf(letra))) {
                NomesFiltrados.add(nome);
            }
        }

        System.out.println("Nomes encontrados que começam com a letra " + letra + ": " + NomesFiltrados);
        System.out.println("Nomes encontrados: " + NomesFiltrados.size());
    }
}
