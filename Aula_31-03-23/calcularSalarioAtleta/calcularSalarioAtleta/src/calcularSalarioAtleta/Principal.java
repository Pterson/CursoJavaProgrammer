package calcularSalarioAtleta;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		jogadorFutebol jFutebol = new jogadorFutebol();
		jogadorVolei jVolei = new jogadorVolei();
		
	    Scanner entradaDeDados = new Scanner(System.in);

	    
		System.out.println("***********Cadastro de Atleta***********");
   
		System.out.println("-----Cadastro Jogador de Futebol-----");
		
		
		// ENTRADA DE DADOS INSERIDAS PELA USUÁRIO
		System.out.println("Digite o nome do jogador de Futebol: ");
		jFutebol.nome = entradaDeDados.next();
		
		System.out.println("Digite a idade do jogador de Futebol: ");		
		jFutebol.idade = Integer.parseInt(entradaDeDados.next()); 
		
		System.out.println("Digite a quantidade de gols marcados: ");
		jFutebol.qtdGols = Integer.parseInt(entradaDeDados.next()); 
		
		System.out.println("Digite a quantidade de partidas jogadas: ");
		jFutebol.qtdPartidas = Integer.parseInt(entradaDeDados.next()); 
		
		
		jogadorFutebol jFutebol = new jogadorFutebol();
		
		entradaDeDados.close();

	}
	
	
	// Criar metodo para calcular salario
	public static double calcularSalario(int qtdDesempenhoTemp, int qtdPartidaTemp) {
		    
		double salarioTemp = (qtdDesempenhoTemp + qtdPartidaTemp) * 1000;
		
		return salarioTemp;
	}

}
