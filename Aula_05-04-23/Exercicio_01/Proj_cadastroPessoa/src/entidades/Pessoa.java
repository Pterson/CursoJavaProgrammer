package entidades;

public class Pessoa {

	private String nome;
	private String cpf;

	// Envia o valor da variavel NOME
	public void setNome(String recebeNome) {
		this.nome = recebeNome;
	}
	
	// Retorna o valor da variavel NOME
	public String getNome() {
		return this.nome;
	}

	
	
	// Envia o valor da variavel CPF
	public void setCpf(String recebeCpf) {
		this.cpf = recebeCpf;
	}
	
	// Retorna o valor da variavel CPF
	public String getCpf() {
		return this.cpf;
	}

}
