package validacao;

import entidades.Convidado;

public class ValidaConvidado {
	
	
	
	
	public String retornaMensagemErro (Convidado convidado) {	
		
		ValidaDadosConvidado validaDadosConvidado = new ValidaDadosConvidado();
					
		String mensagemErro = null;
		

//______Validando CPF
		if (!validaDadosConvidado.validaCpf(convidado.getCpf())) {
			
			mensagemErro = "O cpf: " + convidado.getCpf() + " não é valido!!";
			return mensagemErro;
		}
		
//		boolean validaNome = validaDadosConvidado.validaNome(convidado.getNome());
		
//______Validando NOME
		if (!validaDadosConvidado.validaNome(convidado.getNome())) {
					
			mensagemErro = "O nome: " + convidado.getNome() + " não é valido!!";
			return mensagemErro;			
		}
		
		
//______Validando EMAIL
		if (!validaDadosConvidado.validaEmail (convidado.getEmail())) {
					
			mensagemErro = "O email: " + convidado.getEmail() + " não é valido!!";
			return mensagemErro;					
		}
		
				
//______Validando CPF's Repetidos
		if (!validaDadosConvidado.validaCpf(convidado.getCpf())) {
			
			mensagemErro = "O cpf: " + convidado.getCpf() + " já existe!!";
			return mensagemErro;
			
		}
		
		return null;
		
	}

}//Fecha Classe
