package principal;


import java.util.Scanner;
import entidades.ProfSenior;
import servicos.SalarioServico;


public class Principal {

	public static void main(String[] args) {
		
		Scanner entradaDeDados = new Scanner(System.in);
		
		// OBJETOS PROFESSORES
		ProfSenior pSenior = new ProfSenior();		
		SalarioServico salarioServ = new SalarioServico();
		
		
		
		
		// INSERÇÃO DE DADOS DOS PROFESSORES
		System.out.println("******Cadastro de Professores Senior********");
		
		System.out.println("Digite o nome do Professor Senior:");
		pSenior.nome = entradaDeDados.next();
		
		System.out.println("Digite o CPF do Professor Senior:");
		pSenior.cpf = entradaDeDados.next();
		
		System.out.println("Digite o quantidade de horas trabalhadas pelo Professor Senior:");
		pSenior.qtdHorasTrabalhadas = Integer.parseInt(entradaDeDados.next());

		// VALORES FIXADAS DADOS NO PROBLEMA
		pSenior.valorHorasTrabalhadas = 100;
		pSenior.IrSenior = 10;
		
		
		// CALCULA O SALARIO BRUTO		
		pSenior.salarioB = salarioServ.calSalarioBruto(pSenior.qtdHorasTrabalhadas, pSenior.valorHorasTrabalhadas);
		
		// CALCULA O SALARIO LIQUIDO		
		pSenior.salarioL = salarioServ.calSalarioLiquido(pSenior.salarioB, pSenior.IrSenior);
		
		
		//EXIBE NA TELA VALOR SALARIO PROFESSOR SENIOR
		
		System.out.println("O professor senior tem o salario de:" + pSenior.salarioB);
		System.out.println("O salario liquido do professor senior é:" + pSenior.salarioL);

		entradaDeDados.close();
		
		
		
		
		
	
	}

}
