package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.JogadorFutebol;

public class Principal {

	public static void main(String[] args) {
		
	List<JogadorFutebol> listaJogadores = new ArrayList<>();

		Scanner entradaDados = new Scanner(System.in);

		String resposta = null;
		Boolean result = true;

		do {

			System.out.println("------ MENU DE CADASTRO ------");
			System.out.println("1. Cadastrar 2. Sair");
			System.out.println("");
			resposta = entradaDados.nextLine();
			
			switch (resposta) {
			case "1": 
				
				JogadorFutebol jogadorFutebolRecebido = new JogadorFutebol();
				
				System.out.println("Digite o nome do atleta:");
				jogadorFutebolRecebido.setNome(entradaDados.nextLine());
					
				System.out.println("Digite o cpf do atleta:");
				jogadorFutebolRecebido.setCpf(entradaDados.nextLine());
			
				listaJogadores.add(jogadorFutebolRecebido);
				
				break;
				
			case "2" : 
				result = false;
				break;			
					
			}
			

		} while (result);

		for (JogadorFutebol jogadorFutebolItem : listaJogadores) {
			System.out.println("----- INFORMAÇÕES CADASTRADAS  -----");
			System.out.println("Nome: " + jogadorFutebolItem.getNome());
			System.out.println("CPF: " + jogadorFutebolItem.getCpf());
			System.out.println("------------------------------------");
		}
	}
}