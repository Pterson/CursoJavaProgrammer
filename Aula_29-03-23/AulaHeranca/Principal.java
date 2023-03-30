import java.util.Scanner;

public class Principal{
		public static void main(String[] args) {

// Inicializa o objeto
		Animal AnimalUm = new Animal();
		Animal AnimalDois = new Animal();		
		Mamifero mamiferoUm = new Mamifero();	
		Ave AveUm = new Ave();

// Objeto para receber dados atraves do controle
		Scanner entradaDados = new Scanner(System.in);


		System.out.println("------Cadastro de Animais-----");
		System.out.println("Digite o nome: ");
		AnimalUm.nome = entradaDados.next();
		System.out.println("Digite a especie do Animal: ");
		AnimalUm.especie = entradaDados.next();
		
		System.out.println(AnimalUm.nome);
		System.out.println(AnimalUm.especie);


		System.out.println("************************");


		System.out.println("Digite o nome: ");
		AnimalDois.nome = entradaDados.next();
        System.out.println("Digite a especie do Animal: ");
		AnimalDois.especie = entradaDados.next();
		
		System.out.println(AnimalDois.nome);
		System.out.println(AnimalDois.especie);
		
		
		
		
		System.out.println("------Cadastro dos Mamiferos----");
		
		System.out.println("Digite o nome: ");
		mamiferoUm.nome = entradaDados.next();
		System.out.println("Digite a especie do Animal: ");
		mamiferoUm.especie = entradaDados.next();
		System.out.println("Digite a cor do pelo: ");
		mamiferoUm.corPelo = entradaDados.next();
		
		System.out.println(mamiferoUm.nome);
		System.out.println(mamiferoUm.especie);
		System.out.println(mamiferoUm.corPelo);
		
		
		
		
		System.out.println("------Cadastro de Aves-----");
		
		System.out.println("Digite o nome: ");
		AveUm.nome = entradaDados.next();
		System.out.println("Digite a especie do Animal: ");
		AveUm.especie = entradaDados.next();
		System.out.println("Digite a cor da pena: ");
		AveUm.corPena = entradaDados.next();
		
		System.out.println(AveUm.nome);
		System.out.println(AveUm.especie);
		System.out.println(AveUm.corPena);		
		

		
                }
}