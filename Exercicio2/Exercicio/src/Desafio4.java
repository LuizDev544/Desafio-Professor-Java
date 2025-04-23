package Exercicio2;
import java.util.List;
import java.util.ArrayList;

public class Desafio4 {
    public static void main(String[] args) {
        System.out.println("||Remover Palavras que contem caracter especifico||");

        List<String> ListaPalavras = new ArrayList<>();

        ListaPalavras.add("Banana");
        ListaPalavras.add("Melão");
        ListaPalavras.add("Manga");
        ListaPalavras.add("Kiwi");
        


        System.out.println("Lista de palavras: " + ListaPalavras);

        char letra = 'a';
        List<String> ListaFinal = new ArrayList<>();
        List<String> ListaDosRemovidos = new ArrayList<>();

        for (String palavra : ListaPalavras) {
            if (palavra.contains(String.valueOf(letra))) {
                ListaDosRemovidos.add(palavra);
            } else {
                ListaFinal.add(palavra);
            }
        }

        System.out.println("Palavras removidas que contêm a letra '" + letra + "': " + ListaDosRemovidos);
        System.out.println("Lista final de palavras: " + ListaFinal);
    }
}
