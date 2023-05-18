package manipulacaoArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import entidades.Convidado;
import persistencia.LogDao;

public class LogCrudConvidado {
	
	public void gravarArquivoLogConvidado(Convidado convidado, String tipoDeOperacao) {
		
		LogDao logDao = new LogDao();
		LocalDateTime horaAtual = LocalDateTime.now(); //Inserindo hora do sistema no log                       
		
		String enderecoLog = "D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_05-05-23\\Proj_CadastroConvidadoLista\\ArquivoDeLogs\\logsConvidados.txt";
		String escrita = "";
		
		switch (tipoDeOperacao) {
		
			case  "Deletar":
				escrita = horaAtual + " -- O convidado " + convidado.getNome() + " que tem o convite "+ convidado.getConvite() + "foi excluido!";
				break;
			
			case  "Alterar":
				escrita = horaAtual + " -- O convidado " + convidado.getNome() + " que tem o convite "+ convidado.getConvite() + " foi alterado!";
				break;
			
			case  "Cadastrar":
				escrita = horaAtual + " -- O convidado " + convidado.getNome() + " que tem o convite "+ convidado.getConvite() + " foi cadastrado!" ;
				break;		
		}
		
		try {

			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoLog, true));
			
			buWriter.newLine();
			buWriter.append("------ INFORMAÇÕES DOS LOGS ------");
			buWriter.newLine();
			buWriter.append(escrita + "\n"); // Abrindo o acesso ao arquivo e escrevendo no arquivo;
			buWriter.newLine();			
			buWriter.close();
			
            System.out.println("LOG SALVO!!!");
			
			logDao.registrarLog(convidado, escrita);

		} catch (IOException e) {

			System.out.println("ERRO AO SALVAR O LOG!!!" + e);
		}
	}

}
