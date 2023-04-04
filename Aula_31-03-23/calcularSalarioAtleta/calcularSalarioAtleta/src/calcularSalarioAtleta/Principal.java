package calcularSalarioAtleta;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		jogadorFutebol jFutebol = new jogadorFutebol();
		jogadorVolei jVolei = new jogadorVolei();
		
	    Scanner entradaDeDados = new Scanner(System.in);

	    
		System.out.println("***********Cadastro de Atleta***********");
   
		System.out.println("-----Cadastro Jogador de Futebol-----");
		
		
		// ENTRADA DE DADOS INSERIDAS PELA USUÁRIO - JOGADOR DE FUTEBOL
		System.out.println("Digite o nome do jogador de Futebol: ");
		jFutebol.nome = entradaDeDados.next();
		
		System.out.println("Digite a idade do jogador de Futebol: ");		
		jFutebol.idade = Integer.parseInt(entradaDeDados.next()); 
		
		System.out.println("Digite a quantidade de partidas jogadas: ");
		jFutebol.qtdPartidas = Integer.parseInt(entradaDeDados.next()); 
		
		System.out.println("Digite a quantidade de gols marcados: ");
		jFutebol.qtdGols = Integer.parseInt(entradaDeDados.next()); 
		
		
		//CHAMA O METÓDO PARA CALCULAR O SALÁRIO JOGADOR DE FUTEBOL		
		jFutebol.salario = calcularSalario(jFutebol.qtdGols, jFutebol.qtdPartidas, 1000);

		System.out.println("O salario do jogador é:" + jFutebol.salario);

		
		
		// ENTRADA DE DADOS INSERIDAS PELA USUÁRIO - JOGADOR DE VOLEI		
		System.out.println("-----Cadastro Jogador de Futebol-----");
		
		System.out.println("Digite o nome do jogador de Volei: ");
		jVolei.nome = entradaDeDados.next();
		
		System.out.println("Digite a idade do jogador de Futebol: ");		
		jVolei.idade = Integer.parseInt(entradaDeDados.next());
		
		System.out.println("Digite a quantidade de partidas jogadas: ");
		jVolei.qtdPartidas = Integer.parseInt(entradaDeDados.next()); 
		
		System.out.println("Digite a quantidade de pontos marcados: ");
		jVolei.qtdPontos = Integer.parseInt(entradaDeDados.next()); 

		
		//CHAMA O METÓDO PARA CALCULAR O SALÁRIO JOGADOR DE VOLEI		
		jVolei.salario = calcularSalario(jVolei.qtdPontos, jVolei.qtdPartidas, 500);

		System.out.println("O salario do jogador é:" + jVolei.salario);
		
		
		entradaDeDados.close();

	}
	
	
	    // CRIA METODO PARA CALCULAR SALARIO ATLETAS
	public static double calcularSalario(int qtdDesempenhoTemp, int qtdPartidaTemp, double multiplicador) {
		    
		double salarioTemp = (qtdDesempenhoTemp + qtdPartidaTemp) * multiplicador;
		
		return salarioTemp;
	}

}
