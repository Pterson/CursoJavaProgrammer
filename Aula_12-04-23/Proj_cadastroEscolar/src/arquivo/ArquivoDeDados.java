package arquivo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;
import entidades.Coordenador;
import entidades.Docente;
import entidades.Estudante;

public class ArquivoDeDados {

	
//1======METODO CADASTRO ESTUDANTE NO BUFFER========================================================================================
	
	public void cadastrarEstudante(Estudante estudante) {
		
		String caminhoDados = "D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_12-04-23\\Proj_cadastroEscolar\\src\\arquivo\\dadosEstudante.txt";
		
		try {
			
			 BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(caminhoDados, true))); // classe "FileWriter" em conjunto com a classe "FileOutputStream" com o parametro "true", indicando que o arquivo deve ser aberto em modo de anexo e evitará a sobreposição dos dados.
			 
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
			
			 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminhoDados, true)); //BufferedWriter é um objeto para escrever os dados no arquivo de texto / FileWriter é um objeto para criar o objeto BufferedWriter
			 																				//  parâmetro (true), indica que o arquivo deve ser criado em modo de anexo (append), as novas informações serão adicionadas ao final do arquivo em vez de sobrepor os dados existentes.
			 bufferedWriter.append("NOME: "+ docente.getNome()); // append é método do objeto bufferedWriter 
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
			
			 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminhoDados, true));
			 
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
