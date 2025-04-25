import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro();

        // pegando as informações

        System.out.println("-- Informme os dados do livro --");
        System.out.println("Nome do livro:");
        livro.livros = sc.nextLine();
        System.out.println("Nome do autor:");
        livro.Autor = sc.nextLine();
        System.out.println("Quantidade de livro:");
        livro.quantidade = sc.nextInt();
        System.out.println("Valor do livro R$:");
        livro.valor = sc.nextDouble();

        // calculo do valor toal de todos os itens

        double valorTotal = livro.valorTotalLivro();
        System.out.println("Registro do livro -->  Nome do livro: " + livro.livros + ",  Autor:" + livro.Autor + ", Quantidade disponivel: " + livro.quantidade+",  Valor do livro R$: "+ livro.valor+", Valor total dos livros: R$" + valorTotal);

        // informando a devolução e o emprestimo do livro
        System.out.println("-- informando as quantidades --");

        System.out.println("Informe a quantidade de livros que deseja devolver: ");
        int quantidade = sc.nextInt();
        livro.devolveLivro(quantidade);
        System.out.println("Dados atualizados: " + livro);

        System.out.println("Informe a quantidade de livros que deseja emprestar: ");
        quantidade = sc.nextInt();
        livro.emprestaLivro(quantidade);
        System.out.println("Dados atualizados: " + livro);
        sc.close();
    }
}
