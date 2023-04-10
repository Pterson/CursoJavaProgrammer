package servicos;

public class CalculaLucro {
	
//======RETORNA LIQUIDO BRUTO_______________________________________________
	public double LucroLiquido(double valorDaVendaTemp, double valorDaCompraTemp) {
		
		double LucroLiquidoTemp = valorDaVendaTemp - valorDaCompraTemp;
		
		return LucroLiquidoTemp;
	}
}
