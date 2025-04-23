package exemplo2;

public class ContaMes {
	// atributos
	double agua;
	double alimentacao;
	double luz;
	
	public double SomaGasto() {
		double gastoMes = agua + alimentacao + luz;
		return gastoMes;
	}

}
