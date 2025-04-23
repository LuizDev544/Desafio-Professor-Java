package Polimorfismo.Poli.src;

public class Main {
    public static void main(String[] args) {
        Carro civic = new Carro (true , "" , "" , 0 , 0);

        System.out.println(civic);

        Moto Kawasaki = new Moto (true, "", "", 0, 0);

        System.out.println(Kawasaki);

        Caminhao Merceds = new Caminhao ("", "", 0, 0, true); 

        System.out.println(Merceds);

        System.out.println("O valor do alguel dos carros foi de R$: " + civic.calcularAluguel(10) );

    }
}