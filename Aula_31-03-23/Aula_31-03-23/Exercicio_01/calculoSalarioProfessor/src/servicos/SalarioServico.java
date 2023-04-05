package servicos;

public class SalarioServico {

	// RETORNA O SALARIO BRUTO
	public double calSalarioBruto(int qtdHoraTrabalhada, double valorHora) {

		double salarioBTemp = valorHora * qtdHoraTrabalhada;
		double acrescBonus = 25; // 25% sobre o salario bruto;
		double porceBonus = acrescBonus /100;
		double valorBonus = salarioBTemp * porceBonus;

		if (qtdHoraTrabalhada > 500) {

			salarioBTemp = salarioBTemp + valorBonus;
		}
			
		return salarioBTemp;
	}
	
	

	// RETORNA O SALARIO LIQUIDO
	public double calSalarioLiquido(double salBrutoTemp, double IrSeniorTemp) {

		double porcDescontoTemp = IrSeniorTemp /100;

		double valorDescontoTemp = salBrutoTemp * porcDescontoTemp;
		
		double salLiquidoTemp = salBrutoTemp - valorDescontoTemp;

		return salLiquidoTemp;
	}
	
	
	// RETORNA VALOR DO BONUS
		public double calValorBonus(int qtdHoraTrabalhada, double valorHora) {

			double salarioBTemp = valorHora * qtdHoraTrabalhada;
			double acrescBonus = 25; // 25% sobre o salario bruto;
			double porceBonus = acrescBonus /100;
			double valorBonus = salarioBTemp * porceBonus;

	
			return valorBonus;
		}
	
	
	
	
	
	
	
	
	
}