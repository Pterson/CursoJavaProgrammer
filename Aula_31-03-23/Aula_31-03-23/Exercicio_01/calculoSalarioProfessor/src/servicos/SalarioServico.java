package servicos;

public class SalarioServico {

	// RETORNA O SALARIO BRUTO
	public double calSalarioBruto(int qtdHoraTrabalhada, double valorHora) {

		double salarioTemp;
		salarioTemp = valorHora * qtdHoraTrabalhada;

		return salarioTemp;
	}

	// RETORNA BONUS SALARIO
	public double SalarioBonus(double salBruto, double descontoIr, double salLiquido, double acrescBonus) {

		double porceBonus = acrescBonus / 100;
		double bonus = salBruto * porceBonus;		
		double salBonus = bonus + salBruto;
		salLiquido = salBonus - descontoIr;

		return salLiquido;
	}

	// RETORNA O SALARIO LIQUIDO
	public double calSalarioLiquido(double salBruto, double descontoIr) {

		double porcentagem = descontoIr / 100;
		double valorDesconto = salBruto * porcentagem;
		double salLiquido = salBruto - valorDesconto;

		return salLiquido;
	}
}