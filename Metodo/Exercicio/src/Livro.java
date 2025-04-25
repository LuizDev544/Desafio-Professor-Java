public class Livro{
    public String livros;
    public String Autor;
    public int quantidade;
    public double valor;

    public double valorTotalLivro(){
        double valorTotal = quantidade * valor;
        return valorTotal;
    }

    public void emprestaLivro ( int quantidade){
        this.quantidade -= quantidade;
    }

    public void devolveLivro ( int quantidade){
        this.quantidade += quantidade;
    }


}