package Polimorfismo.Poli.src;

public class Veiculos {

    // atributos
    private String marca;
    private String modelo;
    private int ano;
    private Double valorDiario;


    //construtores
    public Veiculos (String marca , String modelo, int ano, double valorDiario){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiario = valorDiario;
    }


    // get and set 
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(Double valorDiario) {
        this.valorDiario = valorDiario;
    }


    @Override
    
    // toString
    public String toString() {
        return "Veiculos [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", valorDiario=" + valorDiario
                + "]";
    }
}