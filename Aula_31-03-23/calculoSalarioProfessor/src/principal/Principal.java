package principal;

import java.util.Scanner;


import entidades.ProfJunior;
import entidades.ProfPleno;
import entidades.ProfSenior;
import entidades.Professor;
import servicos.SalarioServico;

public class Principal {

	public static void main(String[] args) {

		// OBJETOS PROFESSORES
		ProfSenior pSenior = new ProfSenior();
		ProfPleno pPleno = new ProfPleno();
		ProfJunior pJunior = new ProfJunior();
		
		Professor recebeNome = new Professor();
		Professor recebeCpf = new Professor();
		
		
//		String recebeNome;
//		String recebeCpf;

		SalarioServico salarioServ = new SalarioServico();

		Scanner entradaDeDados = new Scanner(System.in);

		// INSERÇÃO DE DADOS DOS PROFESSORES *SENIOR
		
		
		System.out.println("\n****** Cadastro de Professores Senior ********");
		
	
					
	/*	System.out.println("Digite o nome do Professor Senior:");
		
		nCpf.nome = entradaDeDados.next(nomeCpf);
		nCpf.setNome();
		
		System.out.println("Digite o CPF do Professor Senior:");
		
		nCpf.cpf = entradaDeDados.next(nomeCpf);
		nCpf.setCpf();*/
		
		public Professor nomProfessor (Professor nCpf) {
			Professor professor = new Professor();	
	
			
			nCpf.setNome(JOptionPane.showInputDialog("Digite o NOME"));
			nCpf.setCpf(JOptionPane.showInputDialog("Digite o CPF"));
			
			
			return nCpf;
			
		}
		


		
		System.out.println("Digite o quantidade de horas trabalhadas pelo Professor Senior:");
		pSenior.qtdHorasTrabalhadas = Integer.parseInt(entradaDeDados.next());
		
		

		// VALORES FIXADAS DADOS NO PROBLEMA
		pSenior.valorHorasTrabalhadas = 100;
		pSenior.IrSenior = 10;
		

		// CALCULA O SALARIO BRUTO
		pSenior.salarioB = salarioServ.calSalarioBruto(pSenior.qtdHorasTrabalhadas, pSenior.valorHorasTrabalhadas);

		// CALCULA O SALARIO LIQUIDO
		pSenior.salarioL = salarioServ.calSalarioLiquido(pSenior.salarioB, pSenior.IrSenior);

		// CALCULA O VALOR DO BONUS
		pSenior.valorBonus = salarioServ.calValorBonus(pSenior.qtdHorasTrabalhadas, pSenior.valorHorasTrabalhadas);

		// EXIBE NA TELA VALOR SALARIO PROFESSOR SENIOR
		System.out.println("\n****** Extrato do Professor Senior ********");
		System.out.println("O professor terá um SALÁRIO BRUTO de:" + pSenior.salarioB);

		System.out.println("O SALÁRIO LIQUIDO do professor é:" + pSenior.salarioL);
		
		System.out.println("O valor recebido pelo de PRÊMIO é de:" + pSenior.valorBonus);
		
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
		
		// CALCULA O VALOR DO BONUS
		pPleno.valorBonus = salarioServ.calValorBonus(pPleno.qtdHorasTrabalhadas, pPleno.valorHorasTrabalhadas);

		// EXIBE NA TELA VALOR SALARIO PROFESSOR PLENO
		System.out.println("\n****** Extrato do Professor Pleno ********");
		System.out.println("O professor terá um SALÁRIO BRUTO de:" + pPleno.salarioB);

		System.out.println("O SALÁRIO LIQUIDO do professor é:" + pPleno.salarioL);
				
		System.out.println("O valor recebido pelo de PRÊMIO é de:" + pPleno.valorBonus);

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
		
		// CALCULA O VALOR DO BONUS
		pJunior.valorBonus = salarioServ.calValorBonus(pJunior.qtdHorasTrabalhadas, pJunior.valorHorasTrabalhadas);

		// EXIBE NA TELA VALOR SALARIO PROFESSOR PLENO
		System.out.println("\n****** Extrato do Professor Pleno ********");
		System.out.println("O professor terá um SALÁRIO BRUTO de:" + pJunior.salarioB);
		
	    System.out.println("O SALÁRIO LIQUIDO do professor é:" + pJunior.salarioL);
		
		System.out.println("O valor recebido pelo de PRÊMIO é de:" + pJunior.valorBonus);
		
		entradaDeDados.close();
 
	}

}
