package Polimorfismo.Poli.src;

public class Moto extends Veiculos{
    private boolean Cilindradas;

    
    public Moto(boolean Cilindradas, String marca, String modelo, int ano, double valorDiario) {
        super(marca, modelo, ano, valorDiario);
        this.Cilindradas = Cilindradas;
    }

    @Override
    public String toString() {
        return "Moto [Cilindradas=" + Cilindradas + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
                + ", getAno()=" + getAno() + ", getValorDiario()=" + getValorDiario() + "]";
    }
}