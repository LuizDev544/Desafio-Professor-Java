package exemplo1;

public class carro {
	double motor;
	String fabricante;
	String modelo;
	int ano;
	String placa;
	String cor;
	int velocidade;
	
	
	public void Carraun() {
		System.out.println(
				"\nfabricante: " + fabricante +
				"\nmodelo: " + modelo +
				"\nano: " + ano +
				"\nplaca: " + placa +
				"\ncor: " + cor +
				"\nvelocidade: " + velocidade
				);
	}
	
	public void acelera(int vel) {
		velocidade += vel;
	}
	
	public void freia(int diminui) {
		velocidade -= diminui;
	}
	
	
}
