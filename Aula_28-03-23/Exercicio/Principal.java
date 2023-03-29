import java.util.Scanner;

class Principal {
		
                public static void main(String[] args){
				
                System.out.println("--------- Cadastro de Aluno ---------");

				
				System.out.println("Digite seu nome:");				
				Scanner entradaDados = new Scanner(System.in);	
			
				String nome = entradaDados.next();



                System.out.println("Digite sua idade:");				
				
			
				String idade = entradaDados.next();



                System.out.println("Digite seu endereço:");				
					
				String endereco = entradaDados.next();


				
				System.out.println("O nome digitado foi:");
				System.out.println(nome);

				System.out.println("Sua idade é:");
				System.out.println(idade);

				System.out.println("Seu endereço é:");
				System.out.println(endereco);
				
                }

}