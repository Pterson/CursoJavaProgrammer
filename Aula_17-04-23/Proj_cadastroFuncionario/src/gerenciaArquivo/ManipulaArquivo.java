package gerenciaArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import entidades.Atendente;
import entidades.Coordenador;
import entidades.Gerente;
import telas.TelaMenuPrincipal;


public class ManipulaArquivo {
	
	TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal();
	
	public void registrarGerente(Gerente gerente) {
		String enderecoArquivo = "D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_17-04-23\\Proj_cadastroFuncionario\\arquivosBuffered\\cadastroGerente.txt";

		try {

			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo, true));
			
			buWriter.newLine();
			buWriter.append("------ INFORMAÇÕES DO GERENTE ------");
			buWriter.newLine();
			buWriter.append("Nome: " + gerente.getNome());
			buWriter.newLine();
			buWriter.append("CPF:" + gerente.getCpf());
			buWriter.newLine();
			buWriter.append("Gerência: " + gerente.getGerencia());
			buWriter.close();
			
			JOptionPane.showMessageDialog(null, "Infomações Salvas com sucesso!!!");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void registrarCoordenador(Coordenador coordenador) {
		String enderecoArquivo = "D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_17-04-23\\Proj_cadastroFuncionario\\arquivosBuffered\\cadastroCoordenador.txt";

		try {

			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo, true));
			
			buWriter.newLine();
			buWriter.append("------ INFORMAÇÕES DO COORDENADOR ------");
			buWriter.newLine();
			buWriter.append("Nome: " + coordenador.getNome());
			buWriter.newLine();
			buWriter.append("CPF: " + coordenador.getCpf());
			buWriter.newLine();
			buWriter.append("Coordenação: " + coordenador.getCoordena());
			buWriter.close();
			
			JOptionPane.showMessageDialog(null, "Infomações Salvas com sucesso!!!");
			
			

			
			

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
	
	
	public void registrarAtendente (Atendente atendente) {
		String enderecoArquivo = "D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_17-04-23\\Proj_cadastroFuncionario\\arquivosBuffered\\cadastroAtendente.txt";

		try {

			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo, true));
			
			buWriter.newLine();
			buWriter.append("------ INFORMAÇÕES DO ATENDENTE ------");
			buWriter.newLine();
			buWriter.append("Nome: " + atendente.getNome());
			buWriter.newLine();
			buWriter.append("CPF: " + atendente.getCpf());
			buWriter.newLine();
			buWriter.append("Setor: " + atendente.getSetor());
			buWriter.close();
			
			JOptionPane.showMessageDialog(null, "Infomações Salvas com sucesso!!!");
			
			

		} catch (IOException e) {

			e.printStackTrace();

		}
	}	
	
			
}
