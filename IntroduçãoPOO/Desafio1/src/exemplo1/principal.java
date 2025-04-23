package exemplo1;

public class principal {

	public static void main(String[] args) {
		
		carro civi = new carro();
		
		civi.ano = 2024;
		civi.fabricante = "Honda";
		civi.motor = 2.0;
		civi.placa = "EIC-2490";
		civi.cor = "preto";
		civi.velocidade = 0;
		civi.acelera (10);
		civi.freia(5);
		civi.Carraun();
		
		carro corrols = new carro();
		
		corrols.ano = 2032;
		corrols.fabricante = "Toyotee";
		corrols.motor = 3.0;
		corrols.placa = "FGH-4066";
		corrols.cor = "orange";
		corrols.velocidade = 1;
		corrols.Carraun();

	}

}
