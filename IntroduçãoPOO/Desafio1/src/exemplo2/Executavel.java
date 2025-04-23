package exemplo2;

public class Executavel {

	public static void main(String[] args) {
		
		ContaMes janeiro = new ContaMes();
		ContaMes Fevereiro = new ContaMes();
		
		// gastos Janeiro
		janeiro.alimentacao = 1000;
		janeiro.agua = 300;
		janeiro.luz = 300;
		
		//gastos fevereiro 
		
		Fevereiro.alimentacao = 2000;
		Fevereiro.agua = 200;
		Fevereiro.luz = 350;
		
		//Gasto Total
		
		double gastoJan = janeiro.SomaGasto();
		double gastoFev = Fevereiro.SomaGasto();
		
		if (gastoJan > gastoFev) {
			System.out.println("o gasto em janeiro foi maior");
			
			
		} else if (gastoFev > gastoJan){
			System.out.println("o gasto em Fevereiro foi maior");
			
		
		}else{
			System.out.println("ambos os meses tiveram o mesmo gastos");
		}
		
	}

}
