package Polimorfismo.Poli.src;

public class Carro extends Veiculos implements Alugavel{
    // encapsulamento
    // atributos
    private boolean arCondcionado;

    // construtor
    public Carro(boolean arCondcionado, String marca, String modelo, int ano, double valorDiario) {
        super(marca, modelo, ano, valorDiario);
        this.arCondcionado = arCondcionado;
    }

    @Override
    public String toString() {
        return "Carro [arCondcionado=" + arCondcionado + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
                + ", getAno()=" + getAno() + ", getValorDiario()=" + getValorDiario() + "]";
    }

    @Override
    public double calcularAluguel(int dias) {
        double valorAluguel;

        if (arCondcionado){
            valorAluguel = getValorDiario() * dias * 1.5;

        }else{
            valorAluguel = getValorDiario() * dias;

        }
        
        return valorAluguel;
    }
    

    
}