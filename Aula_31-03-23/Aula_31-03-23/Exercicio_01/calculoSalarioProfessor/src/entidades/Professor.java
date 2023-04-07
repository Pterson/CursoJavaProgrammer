package entidades;

public class Professor {
	
	private String nome;
	private String cpf;
	public double salarioB;
	public double salarioL; 
	public int qtdHorasTrabalhadas;
	public double valorHorasTrabalhadas;
	public double acrescBonus; // 0.25%;
	public double porceBonus;
	public double valorBonus;
	
	
	private String nome;
	
	// Retorna o valor da variavel NOME
	public String getNome() {
		return this.nome;
	}
	
	
	// Retorna o valor da variavel CPF
	public String getCpf() {
		return this.cpf;
	}

}
