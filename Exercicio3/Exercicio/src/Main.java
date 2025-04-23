package Exercicio3.src.Exercicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Roupa> estoque = new ArrayList<>();
        int opcao;

        do {
            System.out.println("1 - Registrar nova roupa");
            System.out.println("2 - Adicionar ao estoque");
            System.out.println("3 - Remover do estoque");
            System.out.println("4 - Exibir todas as roupas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Tamanho: ");
                    String tamanho = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Valor unitário: ");
                    double valor = scanner.nextDouble();
                    estoque.add(new Roupa(marca, tipo, tamanho, quantidade, valor));
                    break;
                case 2:
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio.");
                        break;
                    }
                    mostrarRoupas(estoque);
                    System.out.print("Escolha o índice da roupa para adicionar: ");
                    int idxAdd = scanner.nextInt();
                    System.out.print("Quantidade a adicionar: ");
                    int qtdAdd = scanner.nextInt();
                    estoque.get(idxAdd).adicionarEstoque(qtdAdd);
                    estoque.get(idxAdd).exibirInfo();
                    break;
                case 3:
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio.");
                        break;
                    }
                    mostrarRoupas(estoque);
                    System.out.print("Escolha o índice da roupa para remover: ");
                    int idxRem = scanner.nextInt();
                    System.out.print("Quantidade a remover: ");
                    int qtdRem = scanner.nextInt();
                    estoque.get(idxRem).removerEstoque(qtdRem);
                    estoque.get(idxRem).exibirInfo();
                    break;
                case 4:
                    for (Roupa roupa : estoque) {
                        roupa.exibirInfo();
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void mostrarRoupas(ArrayList<Roupa> estoque) {
        System.out.println("Roupas no estoque:");
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println(i + " - " + estoque.get(i));
        }
    }
}
