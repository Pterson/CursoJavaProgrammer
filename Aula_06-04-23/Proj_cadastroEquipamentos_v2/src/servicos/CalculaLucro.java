package servicos;

public class CalculaLucro {
	
//======RETORNA LIQUIDO BRUTO_______________________________________________
	public double CalculaLucro(double valorDaCompra, double valorDaVenda) {
		
		double LucroLiquido = valorDaCompra - valorDaVenda;
		
		return LucroLiquido;
	}
}
