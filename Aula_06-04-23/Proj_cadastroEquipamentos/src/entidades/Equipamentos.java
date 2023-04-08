package entidades;

public class Equipamentos {
	
	private String codigo;
	private String marca;
	private Double valorDaCompra;
	private Double valorDaVenda;
	private Double lucro;

//____________GETTERS e SETTERS____________	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getValorDaCompra() {
		return valorDaCompra;
	}
	public void setValorDaCompra(Double valorDaCompra) {
		this.valorDaCompra = valorDaCompra;
	}
	public Double getValorDaVenda() {
		return valorDaVenda;
	}
	public void setValorDaVenda(Double valorDaVenda) {
		this.valorDaVenda = valorDaVenda;
	}
	public Double getLucro() {
		return lucro;
	}
	public void setLucro(Double lucro) {
		this.lucro = lucro;
	}
	
}
