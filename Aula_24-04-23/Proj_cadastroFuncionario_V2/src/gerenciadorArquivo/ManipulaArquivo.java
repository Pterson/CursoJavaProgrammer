package gerenciadorArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entidades.Coordenador;

public class ManipulaArquivo {
	
	
	public boolean registrarCoordenador(Coordenador coordenador) {
		
		String enderecoArquivo = "D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_24-04-23\\Proj_cadastroFuncionario_V2\\arquivosBuffered\\cadastroCoordenador.txt";
		Boolean resposta;
		
		try {
			
			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
			
			buWriter.append("O nome do coordenador é: " + coordenador.getNome());
			buWriter.newLine();
			buWriter.append("O cpf do coordenador é:" + coordenador.getCpf());
			buWriter.newLine();
			buWriter.append("A gerencia do coordenador é: " + coordenador.getCoordena());
			buWriter.newLine();
//			buWriter.append("O salario do coordenador é: " + coordenador.calcularSalario());
			
			buWriter.close();
			resposta = true;
			
			
		} catch (IOException e) {
			
			resposta = false;
			
			e.printStackTrace();
		}
		
		return resposta;
		
	}
	

}
