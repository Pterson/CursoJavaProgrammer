package calcularSalarioLiquidoProfessor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		// Objeto professores
		Professor prof = new Professor();
		
		Scanner entradaDeDados = new Scanner(System.in);
		
		
		// Inserção de dados pelo usuário
		System.out.println("******Calcule Salario dos Professores********");
		
		System.out.println("Digite o nome do Professor:");
		prof.nome = entradaDeDados.next();
		
		System.out.println("Digite o CPF do Professor:");
		prof.cpf = entradaDeDados.next();
		
		System.out.println("Digite o quantidade de horas trabalhadas pelo Professor:");
		prof.qtdHorasT = Integer.parseInt(entradaDeDados.next());
		
		System.out.println("Digite valor da hora do Professor:");
		prof.vlrHorasT = Integer.parseInt(entradaDeDados.next());
		
		System.out.println("Digite valor do imposto de renda do Professor:");
		prof.impR = Integer.parseInt(entradaDeDados.next());
		

		entradaDeDados.close();
	}
	
	// Criar metodo para calcular salario Liquido
	public static double calcularSalarioL(int vlrHorasTTemp, int qtdHorasTTemp, int impR, int descontoIRTemp, int salarioLTemp) {
		
		double descontoIRTemp = ((vlrHorasTTemp * qtdHorasTTemp) * impR/100);
		
		double salarioLTemp = (vlrHorasTTemp * qtdHorasTTemp) - descontoIRTemp;
				
		return salarioLTemp;
	}

}
