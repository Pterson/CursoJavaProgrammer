package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class FabricaConexao {
	
	private static String USUARIO = "root"; // variaveis de configuração sempre em maiuscula e estaticas por boa pratica - usuario
	private static String SENHA = "root"; // senha
	
	private static String BANCO_URL = "jdbc:mysql://localhost:3306/db_cadastro_convidado?useTimezone=true&serverTimezone=UTC"; //URL DO BANCO CADASTRO
	
	private static String BANCO_URL_USUARIOS = "jdbc:mysql://localhost:3306/db_usuarios?useTimezone=true&serverTimezone=UTC";//URL DO BANCO AUTENTICAÇÃO
	
	public Connection criarConexao() {

		Connection conexao;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); //Indica o driver que será usado pelo Banco
			
			conexao = DriverManager.getConnection(BANCO_URL, USUARIO, SENHA); // Cria conexão 
			
			System.out.println("CONECTOU AO BANCO");
		

		}catch (Exception e) {
			conexao = null;

			System.out.println("FALHA NA CONEXÃO AO BANCO");
			
			System.out.println(e);
		}
		
		return conexao;
	}
	
	
	public Connection criarConexaoUsuarios() {
		
		Connection conexao;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// Indica o Drive que vai ser usado
			
			conexao = DriverManager.getConnection(BANCO_URL_USUARIOS, USUARIO, SENHA); //CRIA CONEXÃO
			System.out.println("BANCO CONECTADO!");
			
		} catch (Exception e) {
			
			conexao = null;
			System.out.println("ERRO, BANCO NÃO CONECTADO!");
			JOptionPane.showMessageDialog(null, "ERRO NO BANCO");
			System.out.println(e);
		}
		
		
		return conexao;		
	}
	
	
}
