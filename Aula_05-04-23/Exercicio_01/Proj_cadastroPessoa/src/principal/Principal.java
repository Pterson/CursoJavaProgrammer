package principal;

import java.util.Scanner;
import entidades.Pessoa;

public class Principal {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		
		Pessoa pFisica = new Pessoa();
			
		String recebeNome;
		String recebeCpf;
		
		
		// RECEBE DADOS DO USUÁRIO
		System.out.println("Digite o nome da pessoa:");
		recebeNome = entradaDados.next();		
		pFisica.setNome(recebeNome); //Envio informação da varivel para metodo da class Pessoa que está na entidade
		
		System.out.println("Digite o CPF da pessoa:");
		recebeCpf = entradaDados.next();
		pFisica.setCpf(recebeCpf);//Envio informação da varivel para metodo da class Pessoa que está na entidade
		
		// EXIBE NA TELA AS INFORMAÇÕES DO CADASTRO
		System.out.println("Nome ->" + pFisica.getNome()); // pFisica.getNome pegando valor da classe pFisica
		System.out.println("CPF  ->" + pFisica.getCpf());
		
		entradaDados.close();
   }
}