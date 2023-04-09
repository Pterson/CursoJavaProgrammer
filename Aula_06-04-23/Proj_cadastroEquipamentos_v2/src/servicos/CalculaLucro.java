package servicos;

public class CalculaLucro {
	
//======RETORNA LIQUIDO BRUTO_______________________________________________
	public double CalculaLucro(double valorDaCompra, double valorDaVenda) {
		double lucro = valorDaCompra - valorDaVenda;
		
		return lucro;
	}
}
