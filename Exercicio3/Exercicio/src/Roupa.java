package Exercicio3.src.Exercicio;

public class Roupa {
        private String marca;
        private String tipo;
        private String tamanho;
        private int quantidade;
        private double valor;
    
        public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
            this.marca = marca;
            this.tipo = tipo;
            this.tamanho = tamanho;
            this.quantidade = quantidade;
            this.valor = valor;
        }
    
        public double calcularValorTotal() {
            return quantidade * valor;
        }
    
        public void adicionarEstoque(int quantidade) {
            this.quantidade += quantidade;
        }
    
        public void removerEstoque(int quantidade) {
            if (quantidade <= this.quantidade) {
                this.quantidade -= quantidade;
            } else {
                System.out.println("Erro: Quantidade insuficiente em estoque.");
            }
        }
    
        public void exibirInfo() {
            System.out.println("Marca: " + marca);
            System.out.println("Tipo: " + tipo);
            System.out.println("Tamanho: " + tamanho);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Valor unitário: R$" + valor);
            System.out.println("Valor total em estoque: R$" + calcularValorTotal());
            System.out.println("---------------------------------");
        }
    }