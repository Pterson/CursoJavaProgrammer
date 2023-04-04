package principal;

import java.util.Scanner;

import entidades.ProfJunior;
import entidades.ProfPleno;
import entidades.ProfSenior;
import servicos.SalarioServico;

public class Principal {

	public static void main(String[] args) {

		// OBJETOS PROFESSORES
		ProfSenior pSenior = new ProfSenior();
		ProfPleno pPleno = new ProfPleno();
		ProfJunior pJunior = new ProfJunior();

		SalarioServico salarioServ = new SalarioServico();

		Scanner entradaDeDados = new Scanner(System.in);

		// INSERÇÃO DE DADOS DOS PROFESSORES *SENIOR
		System.out.println("\n****** Cadastro de Professores Senior ********");

		System.out.println("Digite o nome do Professor Senior:");
		pSenior.nome = entradaDeDados.next();

		System.out.println("Digite o CPF do Professor Senior:");
		pSenior.cpf = entradaDeDados.next();

		System.out.println("Digite o quantidade de horas trabalhadas pelo Professor Senior:");
		pSenior.qtdHorasTrabalhadas = Integer.parseInt(entradaDeDados.next());

		// VALORES FIXADAS DADOS NO PROBLEMA
		pSenior.valorHorasTrabalhadas = 100;
		pSenior.IrSenior = 10;
		pSenior.acrescBonus = 25;

		// CALCULA O SALARIO BRUTO
		pSenior.salarioB = salarioServ.calSalarioBruto(pSenior.qtdHorasTrabalhadas, pSenior.valorHorasTrabalhadas);

		// CALCULA O SALARIO LIQUIDO
		pSenior.salarioL = salarioServ.calSalarioLiquido(pSenior.salarioB, pSenior.IrSenior);

		// CALCULA O SALARIO BONUS
		pSenior.salarioL = salarioServ.SalarioBonus(pSenior.salarioB, pSenior.acrescBonus, pSenior.salarioL, pSenior.IrSenior);

		// EXIBE NA TELA VALOR SALARIO PROFESSOR SENIOR
		System.out.println("O professor senior tem o salario de:" + pSenior.salarioB);
		System.out.println("O salario liquido do professor senior é:" + pSenior.salarioL);

		if (pSenior.qtdHorasTrabalhadas > 500) {

			System.out.println("O professor senior ganhou um bonus de:" + pSenior.salarioL);
		}

// ***************************************************#########################################***************************************************#########################################

		// INSERÇÃO DE DADOS DOS PROFESSORES *PLENO
		System.out.println("\n****** Cadastro de Professores Pleno ********");

		System.out.println("Digite o nome do Professor Pleno:");
		pPleno.nome = entradaDeDados.next();

		System.out.println("Digite o CPF do Professor Pleno:");
		pPleno.cpf = entradaDeDados.next();

		System.out.println("Digite o quantidade de horas trabalhadas pelo Professor Pleno:");
		pPleno.qtdHorasTrabalhadas = Integer.parseInt(entradaDeDados.next());

		// VALORES FIXADAS DADOS NO PROBLEMA
		pPleno.valorHorasTrabalhadas = 80;
		pPleno.IrPleno = 7;

		// CALCULA O SALARIO BRUTO
		pPleno.salarioB = salarioServ.calSalarioBruto(pPleno.qtdHorasTrabalhadas, pPleno.valorHorasTrabalhadas);

		// CALCULA O SALARIO LIQUIDO
		pPleno.salarioL = salarioServ.calSalarioLiquido(pPleno.salarioB, pPleno.IrPleno);

		// EXIBE NA TELA VALOR SALARIO PROFESSOR PLENO
		System.out.println("O professor pleno tem o salario de:" + pPleno.salarioB);
		System.out.println("O salario liquido do professor pleno é:" + pPleno.salarioL);

// ***************************************************#########################################***************************************************#########################################

		// INSERÇÃO DE DADOS DOS PROFESSORES
		System.out.println("\n****** Cadastro de Professores Junior ********");

		System.out.println("Digite o nome do Professor Junior:");
		pJunior.nome = entradaDeDados.next();

		System.out.println("Digite o CPF do Professor Junior:");
		pJunior.cpf = entradaDeDados.next();

		System.out.println("Digite o quantidade de horas trabalhadas pelo Professor Junior:");
		pJunior.qtdHorasTrabalhadas = Integer.parseInt(entradaDeDados.next());

		// VALORES FIXADAS DADOS NO PROBLEMA
		pJunior.valorHorasTrabalhadas = 60;
		pJunior.IrJunior = 5;

		// CALCULA O SALARIO BRUTO
		pJunior.salarioB = salarioServ.calSalarioBruto(pJunior.qtdHorasTrabalhadas, pJunior.valorHorasTrabalhadas);

		// CALCULA O SALARIO LIQUIDO
		pJunior.salarioL = salarioServ.calSalarioLiquido(pJunior.salarioB, pJunior.IrJunior);

		// EXIBE NA TELA VALOR SALARIO PROFESSOR SENIOR
		System.out.println("O professor junior tem o salario de:" + pJunior.salarioB);
		System.out.println("O salario liquido do professor junior é:" + pJunior.salarioL);

		entradaDeDados.close();

	}

}
