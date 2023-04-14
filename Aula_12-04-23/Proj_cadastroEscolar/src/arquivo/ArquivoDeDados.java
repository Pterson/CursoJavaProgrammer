package arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

import entidades.Coordenador;
import entidades.Docente;
import entidades.Estudante;

public class ArquivoDeDados {

	
//1======METODO CADASTRO ESTUDANTE NO BUFFER========================================================================================
	
	public void cadastrarEstudante(Estudante estudante) {
		
		String caminhoDados = "D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_12-04-23\\Proj_cadastroEscolar\\src\\arquivo\\dadosEstudante.txt";
		
		try {
			
			 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminhoDados));
			 
			 bufferedWriter.append("NOME: "+ estudante.getNome());
			 bufferedWriter.newLine();			 
			 bufferedWriter.append("MATRICULA: "+ estudante.getMatricula());
			 bufferedWriter.newLine();			 
			 bufferedWriter.append("TURMA: "+ estudante.getTurma());
			 bufferedWriter.close();
			 
			 JOptionPane.showMessageDialog(null, "Infomações Salvas com sucesso!!!");
		}
		
		catch (IOException e) {
			 JOptionPane.showMessageDialog(null, "Erro ao salvar as informações!!!");
			 e.printStackTrace();
		}
	}
//1___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________	

	
	
	
//2======METODO CADASTRO DOCENTE NO BUFFER========================================================================================
	
	public void cadastrarDocente(Docente docente) {
		
		String caminhoDados = "D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_12-04-23\\Proj_cadastroEscolar\\src\\arquivo\\dadosDocente.txt";
		
		try {
			
			 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminhoDados));
	
			 bufferedWriter.append("NOME: "+ docente.getNome());
			 bufferedWriter.newLine();
			 bufferedWriter.append("DISCIPLINA: "+ docente.getDisciplina());
			 bufferedWriter.newLine();
			 bufferedWriter.append("MATRICULA: "+ docente.getMatricula());
			 bufferedWriter.close();
			 
			 JOptionPane.showMessageDialog(null, "Infomações Salvas com sucesso!!!");
		}
		
		catch (IOException e) {
			 JOptionPane.showMessageDialog(null, "Erro ao salvar as informações!!!");
			 e.printStackTrace();
		}
	}
//2___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________	

	
	
	
//3======METODO CADASTRO COORDENADORE NO BUFFER========================================================================================

	public void cadastrarCoordenador(Coordenador coordenador) {
		
		String caminhoDados = "D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_12-04-23\\Proj_cadastroEscolar\\src\\arquivo\\dadosCoordenador.txt";
		
		try {
			
			 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminhoDados));
			 
			 bufferedWriter.append("NOME: "+ coordenador.getNome());
			 bufferedWriter.newLine();
			 bufferedWriter.append("GESTÃO: "+ coordenador.getGerencia());
			 bufferedWriter.newLine();
			 bufferedWriter.append("MATRICULA: "+ coordenador.getMatricula());
			 bufferedWriter.close();
			 
			 JOptionPane.showMessageDialog(null, "Infomações Salvas com sucesso!!!");
		}
		
		catch (IOException e) {
			 JOptionPane.showMessageDialog(null, "Erro ao salvar as informações!!!");
			 e.printStackTrace();
		}
	}	
//3___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________	
	
}
