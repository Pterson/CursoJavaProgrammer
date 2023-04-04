
/*Crie um projeto Java para atender a seguinte necessidade:

	Receba dois numeros do usuario, realize a multiplicação entre eles
	
	e apresente o resultado.*/

package exercicioMultiplicador;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double numero1;
		double numero2;

		String numeroUmString;
		String numeroDoisString;
		
		double multiplica;

		// OBJETO DE ENTRADA DE DADOS
		Scanner entradaDados = new Scanner(System.in);

		// INSERÇÃO DE DADOS PELO USUÁRIO
		System.out.println("Digite o primeiro número: ");
		
		// ALTERA OS VALORES RECEBIDOS NAS RESPECTIVAS VARIAVEIS
		numeroUmString = entradaDados.next();		
		numero1 = Integer.parseInt(numeroUmString);		
		
		
//**************** SEGUNDA FASE 
		
		System.out.println("Digite o segundo número: ");
		
		numeroDoisString = entradaDados.next();		
		numero2 = Integer.parseInt(numeroDoisString);
		
		multiplica = numero1 * numero2;
		
		// EXIBE NA TELA PARA USUARIOS
		
		System.out.println("O 1° numero um double é: " + numero1);
		System.out.println("O 2° numero um double é: " + numero2);
		
		System.out.println("O resultado da multiplicação entre os numeros é: " + multiplica);
		
		
		
		
		
		
		
		
		
		entradaDados.close();
	}

}
