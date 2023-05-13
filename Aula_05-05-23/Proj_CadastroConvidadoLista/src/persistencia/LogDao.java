package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entidades.Convidado;

public class LogDao {
	
	public void registrarLog(Convidado convidadoNovo, String escritaLog) {
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		
		String insertLogComando = "insert into tabela_log(escrita_log) values(?)"; // Comando sql que será executado
		
		Connection conexao = null;
		PreparedStatement declaracaoComando = null;
		
		try {
			conexao = fabricaConexao.criarConexao(); // Buscando a conexao
			
			declaracaoComando = (PreparedStatement)conexao.prepareStatement(insertLogComando); // Adiciona a conexão e o comando que será executado
			
			declaracaoComando.setString(1, escritaLog);
			
			declaracaoComando.execute();
			
		} catch (Exception e) {
			
			System.out.println("ERRO ao registrar Log");
			
		} finally {
			try {
				
				if(conexao != null) {
					conexao.close();
				}
				
				if(declaracaoComando != null) {
					declaracaoComando.close();
				}
				
			} catch (Exception e2) {
				System.out.println("ERRO ao fechar a conexao");
			}
		}
			
	}

}
