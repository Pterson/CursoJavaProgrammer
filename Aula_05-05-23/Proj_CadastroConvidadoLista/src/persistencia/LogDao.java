package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entidades.Convidado;

public class LogDao {
	
	public void registrarLog(Convidado convidadoNovo, String escritaLog) {
		
		FabricaConexao fabricaConexao = new FabricaConexao(); //CHAMANDO CONEXÃO COM DO BANCO
		
		String insertLogComando = "INSERT INTO tabela_log(escrita_log) VALUES(?)"; // Comando sql que será executado
		
		
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
			
			try {// este try é para fechar as conexões
				
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
