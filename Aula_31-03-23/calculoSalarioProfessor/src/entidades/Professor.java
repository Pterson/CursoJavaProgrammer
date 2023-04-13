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
	
//=======GETTERS e SETTER_________________________	
	
	public String getNome() {
		return nome;
	}
	public void setNome(Professor recebeNome) {
		this.nome = recebeNome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
	
	