package Polimorfismo.Poli.src;

public class Caminhao extends Veiculos {
    private boolean Eixo;

    public Caminhao(String marca, String modelo, int ano, double valorDiario, boolean eixo) {
        super(marca, modelo, ano, valorDiario);
        Eixo = eixo;
    }

    @Override
    public String toString() {
        return "Caminhao [Eixo=" + Eixo + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getAno()="
                + getAno() + ", getValorDiario()=" + getValorDiario() + "]";
    }

    



    
}
