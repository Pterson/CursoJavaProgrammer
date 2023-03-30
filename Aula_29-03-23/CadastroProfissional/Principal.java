import java.util.Scanner;

public class Principal{
		public static void main(String[] args) {

// Inicializa o objeto
		AdmBanco admBancoUm = new AdmBanco();
		Programador programadorUm = new Programador();



// Objeto para receber dados atraves do controle
		Scanner entradaDados = new Scanner(System.in);


		System.out.println("------Cadastro Administrador BD-----");
		
		System.out.println("Digite nome do DBA: ");
		admBancoUm.nome = entradaDados.next();
		
		System.out.println("Digite seu CPF: ");
		admBancoUm.cpf = entradaDados.next();
		
	
	    System.out.println("Qual tipo de banco de dados administra? ");
		admBancoUm.tipoDeBancoDeDados = entradaDados.next();

// Exibe informações em tela
        System.out.println("------Informacoes de cadastro dos DBA's-----");			
		System.out.println("Nome do DBA: "+ admBancoUm.nome);
		System.out.println("CPF do DBA: "+ admBancoUm.cpf);
		System.out.println("Linguagem do BD: "+ admBancoUm.tipoDeBancoDeDados);

		System.out.println("************************");
		
		



		System.out.println("------Cadastro Programador-----");
		
		System.out.println("Digite nome do Programador: ");
		programadorUm.nome = entradaDados.next();
		
		System.out.println("Digite seu CPF: ");
		programadorUm.cpf = entradaDados.next();
		
	
	    System.out.println("Em qual linguagem desenvolve? ");
		programadorUm.linguaguem = entradaDados.next();

// Exibe informações em tela
        System.out.println("------Informacoes de cadastro dos Programadores-----");		
		System.out.println("Nome do programdador: "+ programadorUm.nome);
		System.out.println("CPF do programador: "+ programadorUm.cpf);
		System.out.println("Linguagem que desenvolve: "+ programadorUm.linguaguem);

		System.out.println("************************");


	

		
                }
}