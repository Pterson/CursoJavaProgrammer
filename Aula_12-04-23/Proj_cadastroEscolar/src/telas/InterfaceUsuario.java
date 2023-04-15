package telas;

import javax.swing.JOptionPane;

import arquivo.ArquivoDeDados;
import entidades.Coordenador;
import entidades.Docente;
import entidades.Estudante;

public class InterfaceUsuario {

//1======INICIA OBJETO MENU (INSTANCIA DO OBJETOS A PARTIR DO PACOTE ENTIDADES)____________________________________________________________________________
		Estudante estudante = new Estudante();
		Docente docente = new Docente();
		Coordenador coordenador = new Coordenador();
//1___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________	



//2======================================================_____MENU USUÁRIOS_____====================================================================	
		public void menu() {
			int escolha;
			boolean encerrar = true;
			
			ArquivoDeDados arquivodedados = new ArquivoDeDados();
		
		do {	
			escolha = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA OPÇÃO:\n" + "1. Estudante\n"+ "2. Docente\n"+  "3. Coodenador\n"+  "4. Encerrar"));
				
			if (escolha == 1) {					
			//	arquivodedados.cadastrarEstudante(cadastrarEstudante(estudante)); 
				estudante = cadastrarEstudante(estudante);
				arquivodedados.cadastrarEstudante(estudante);
				exibeEstudante(estudante);
				}
				
				else if (escolha == 2) {		
				//	arquivodedados.cadastrarDocente(cadastrarDocente(docente)); 
					docente = cadastrarDocente(docente);
					arquivodedados.cadastrarDocente(docente);					
					exibeDocente(docente);
				}
				  
				else if (escolha == 3) {
				//	arquivodedados.cadastrarCoordenador(cadastrarCoordenador(coordenador));
					coordenador = cadastrarCoordenador(coordenador);
					arquivodedados.cadastrarCoordenador(coordenador);
					exibeCoordenador(coordenador);
				}	
				
				else if (escolha == 4) {
					 encerrar = false;
		             JOptionPane.showMessageDialog(null, "Encerrando...");
		             System.exit(0); // Encerrando a execução do programa
				}
				
				else {
					 JOptionPane.showMessageDialog(null, "Opção Inválida!!!");
				}
			
		    }while(encerrar);	
			
		 }
//2___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________	



		
//3======BLOCO INSERÇÃO DE DADOS NO CADASTRO ESTUDANTE (SET)========================================================================================

		public Estudante cadastrarEstudante(Estudante cadastrarEstudante) {
			
			cadastrarEstudante.setNome(JOptionPane.showInputDialog("Digite o nome do estudante: "));
			cadastrarEstudante.setMatricula(JOptionPane.showInputDialog("Digite a matricula do estudante: "));
			cadastrarEstudante.setTurma(JOptionPane.showInputDialog("Digite a turma do estudante: "));
			
			return cadastrarEstudante;
		}
//3___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________	




//4======BLOCO EXIBE INFORMAÇÕES CADASTRADAS ESTUDANTE (GET)======================================================================================	

		public void exibeEstudante(Estudante exibeEstudante) {
			
			StringBuilder janelaUser = new StringBuilder(); // CRIANDO UMA NOVA INSTÂNCIA DA CLASSE "StringBuilder" - é uma classe que permite criar e manipular strings, janelaUser (nova instância) que será exibida na caixa de diálogo.
			
			janelaUser.append("CONFIRME AS INFORMAÇÕES DO ESTUDANTE:\n");			
			janelaUser.append("Nome: ").append(exibeEstudante.getNome()).append("\n");
			janelaUser.append("Matrícula: ").append(exibeEstudante.getMatricula()).append("\n");
			janelaUser.append("Turma: ").append(exibeEstudante.getTurma()).append("\n");
			
			JOptionPane.showMessageDialog(null, janelaUser.toString());
			
			/*
			JOptionPane.showMessageDialog(null,"CONFIRME AS INFORMAÇÕES");
			JOptionPane.showMessageDialog(null,"O nome do estudante cadastrado foi: " + exibeEstudante.getNome());
			JOptionPane.showMessageDialog(null,"O número de matricula do estudante é: " + exibeEstudante.getMatricula());
			JOptionPane.showMessageDialog(null,"O estudante está na turma: " + exibeEstudante.getTurma());
			*/			
		}
//4___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________	




//5======BLOCO INSERÇÃO DE DADOS NO CADASTRO DOCENTE (SET)========================================================================================
		
		public Docente cadastrarDocente (Docente cadastrarDocente) {
			
			cadastrarDocente.setNome(JOptionPane.showInputDialog("Digite o nome do docente: "));			
			cadastrarDocente.setDisciplina(JOptionPane.showInputDialog("Digite a disciplina do docente: "));			
			cadastrarDocente.setMatricula(JOptionPane.showInputDialog("Digite a matricula do docente: "));
			
			return cadastrarDocente;
		}
//5___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________




//6======BLOCO EXIBE INFORMAÇÕES CADASTRADAS DOCENTE (GET)======================================================================================	

		public void exibeDocente (Docente exibeDocente) {
			
			StringBuilder janelaUser = new StringBuilder(); 
			
			janelaUser.append("CONFIRME AS INFORMAÇÕES DO DOCENTE:\n");
			janelaUser.append("Nome: ").append(exibeDocente.getNome()).append("\n");
			janelaUser.append("Disciplina: ").append(exibeDocente.getDisciplina()).append("\n");
			janelaUser.append("Matrícula: ").append(exibeDocente.getMatricula()).append("\n");

		    JOptionPane.showMessageDialog(null, janelaUser.toString());
			
		/*	JOptionPane.showMessageDialog(null,"CONFIRME AS INFORMAÇÕES");
			JOptionPane.showMessageDialog(null,"O nome do docente cadastrado foi: " + exibeDocente.getNome());			
			JOptionPane.showMessageDialog(null,"O disciplina do docente é: " + exibeDocente.getDisciplina());
			JOptionPane.showMessageDialog(null,"A matricula do docente é: " + exibeDocente.getMatricula());		
		*/
		}
//6___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________

		
		
		
		
//7======BLOCO INSERÇÃO DE DADOS NO CADASTRO COORDENADOR (SET)========================================================================================
		
		public Coordenador cadastrarCoordenador (Coordenador cadastrarCoordenador) {
			
			cadastrarCoordenador.setNome(JOptionPane.showInputDialog("Digite o nome do coordenador: "));
			cadastrarCoordenador.setGerencia(JOptionPane.showInputDialog("Digite qual tipo de gestão: "));
			cadastrarCoordenador.setMatricula(JOptionPane.showInputDialog("Digite a matricula do coordenador: "));
			
			return cadastrarCoordenador;			
		}
//7___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________

		
		
		
//8======BLOCO EXIBE INFORMAÇÕES CADASTRADAS COORDENADOR (GET)======================================================================================
		
		public void exibeCoordenador (Coordenador exibeCoordenador) {
			
			StringBuilder janelaUser = new StringBuilder(); 
			
			janelaUser.append("CONFIRME AS INFORMAÇÕES DO COORDENADOR:\n");
			janelaUser.append("Nome: ").append(exibeCoordenador.getNome()).append("\n");
			janelaUser.append("O coordenador faz gestão de: ").append(exibeCoordenador.getGerencia()).append("\n");
			janelaUser.append("Matrícula: ").append(exibeCoordenador.getMatricula()).append("\n");
			
			JOptionPane.showMessageDialog(null, janelaUser.toString());
			
			/*
			JOptionPane.showMessageDialog(null,"CONFIRME AS INFORMAÇÕES");
			JOptionPane.showMessageDialog(null,"O nome do coordenador cadastrado foi: " + exibeCoordenador.getNome());
			JOptionPane.showMessageDialog(null,"O coordenador faz gestão de: " + exibeCoordenador.getGerencia());
			JOptionPane.showMessageDialog(null,"A matricula do coordenador é: " + exibeCoordenador.getMatricula());
			*/	
		}
//8___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________

}//FECHANDO INTERFACEUSUARIO
