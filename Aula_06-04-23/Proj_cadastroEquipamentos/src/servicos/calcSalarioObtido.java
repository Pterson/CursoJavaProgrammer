package servicos;

public class calcSalarioObtido {

//======RETORNA CALCULO DO LIQUIDO BRUTO_______________________________________________
	public double calcSalarioObtido(double valorDaCompra, double valorDaVenda) {
		
		double lucro = valorDaCompra - valorDaVenda;
		
		return lucro;
		
	}
		
}
