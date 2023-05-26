package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import entidades.Convidado;
import manipulacaoArquivo.LogCrudConvidado;

// Que que acessa a tabela Objeto Convidado
public class ConvidadoDao {
	
	LogCrudConvidado logCrudConvidado = new LogCrudConvidado();
	
	public boolean salvarConvidadoBanco(Convidado convidado) {
		
		FabricaConexao fabricaConexao = new FabricaConexao();	
		
		boolean salvamento = false; // Resposta do metodo
		
		String comandoSqlInsert = "INSERT INTO tabela_convidado (cpf, nome, endereco, profissao, email, convite) VALUES (?, ?, ?, ?, ?, ?)";
		
		
		
		Connection conexaoRecebida = null; // recebe a conexao
		PreparedStatement declaracaoComando = null; // preparação do comando 
		
		try {
			
			conexaoRecebida = fabricaConexao.criarConexao();
			
			declaracaoComando = (PreparedStatement)conexaoRecebida.prepareStatement(comandoSqlInsert); //Preparação do comando recebendo o banco com o comando sql
		
			declaracaoComando.setString(1, convidado.getCpf());
			declaracaoComando.setString(2, convidado.getNome().toUpperCase()); // Upper Case utilizando para salvar em maiuscula no banco
			declaracaoComando.setString(3, convidado.getEndereco().toUpperCase());
			declaracaoComando.setString(4, convidado.getProfissao().toUpperCase());
			declaracaoComando.setString(5, convidado.getEmail().toUpperCase());
			declaracaoComando.setString(6, convidado.getConvite());
		
			declaracaoComando.execute();
			
			salvamento = true;
			System.out.println("Convidado Registrado");
			logCrudConvidado.gravarArquivoLogConvidado(convidado, "Cadastrar");
			
		} catch (Exception e) {
			
			System.out.println(e);
			System.out.println("ERRO ao Registrar");
			salvamento = false;
		
		}finally { //Executa apos verificar o Try e Catch
			
			try { // Tenta fechar o banco
				
				if(conexaoRecebida != null) { //Verifica se a conexao esta nula
					conexaoRecebida.close();					
				}
				
				if (declaracaoComando != null) {
					declaracaoComando.close();					
				}
				
			} catch (Exception e2) {
					System.out.println(e2);
					System.out.println("ERRO ao Fechar a conexao");
				}	
				
			}
					
		return salvamento;
	}
	
	
	public boolean deletarConvidadoCpf(String cpf) {
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		boolean exclusao = false; // Resposta do metodo
		
		String comandoSqlDeletar = "DELETE FROM tabela_convidado WHERE cpf = ?";
			
				Connection conexaoRecebida = null; // recebe a conexao
				PreparedStatement declaracaoComando = null; // preparação do comando 
				
		try {
					
			conexaoRecebida = fabricaConexao.criarConexao();
					
			declaracaoComando = (PreparedStatement)conexaoRecebida.prepareStatement(comandoSqlDeletar); //Preparação do comando recebendo o banco com o comando sql
				
			declaracaoComando.setString(1, cpf);
				
			declaracaoComando.execute();
					
			exclusao = true;
			System.out.println("Convidado Deletado!");
					
		} catch (Exception e) {
					
					System.out.println(e);
					System.out.println("ERRO ao Deletar!");
					exclusao = false;
				
		} finally { //Executa apos verificar o Try e Catch
             		
             try { // Tenta fechar o banco
						
			     if(conexaoRecebida != null) { //Verifica se a conexao esta nula
					 conexaoRecebida.close();					
				 }
						
				 if (declaracaoComando != null) {
					  declaracaoComando.close();					
				 }
						
              } catch (Exception e2) {
				  System.out.println(e2);
				  System.out.println("ERRO ao Fechar a conexao");
				}	
						
		   }					
					
		return exclusao;
	}	
	
	
	public List<Convidado> buscarListaDeConvidados() {
		
		String comandoSqlBuscar = "SELECT * FROM tabela_convidado";
		
		List<Convidado> listaConvidadosDoBanco = new ArrayList<>();
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		
		Connection conexaoRecebida = null; // recebe a conexao
		PreparedStatement declaracaoComando = null; // preparação do comando 
		
		ResultSet resultadoTabela = null;
		
		try {
			
			conexaoRecebida = fabricaConexao.criarConexao();
			
			declaracaoComando = (PreparedStatement)conexaoRecebida.prepareStatement(comandoSqlBuscar); // Preparação do comanda recebe o banco e o comando SQL
			
			resultadoTabela = declaracaoComando.executeQuery(); // recebe o comando executado pela query
			
			while (resultadoTabela.next()) {
				  
				Convidado convidado = new Convidado();
				
				convidado.setCpf(resultadoTabela.getString("cpf"));
				convidado.setNome(resultadoTabela.getString("nome"));
				convidado.setEndereco(resultadoTabela.getString("endereco"));
				convidado.setProfissao(resultadoTabela.getString("profissao"));
				convidado.setEmail(resultadoTabela.getString("email"));
				convidado.setConvite(resultadoTabela.getString("convite"));
				
				listaConvidadosDoBanco.add(convidado);				
			}
			
	   } catch (Exception e2) {
		   
			System.out.println(e2);
			System.out.println("Erro ao Buscar!");
			
			
		} finally { // Executar depois de verificar o try
			
			try {//Try para fechar a conexao
				
				if(conexaoRecebida != null) {// Verifica se a conexão é nula
					conexaoRecebida.close();
				}
				
				if (declaracaoComando != null) {
					declaracaoComando.close();
				}
				
			} catch (Exception msgErro) {
				System.out.println(msgErro);
				System.out.println("Erro ao tentar fechar a conexao");
			}
			
	}		
		
		return listaConvidadosDoBanco;
	

	}


	public boolean alterarConvidado(Convidado convidadoNovo) {

		FabricaConexao fabricaConexao = new FabricaConexao();
		boolean alteracao = false; // Resposta do metodo
		
		String comandoSqlUpdate = "UPDATE tabela_convidado SET cpf = ?, nome = ?, endereco = ?, profissao = ?, email = ?, convite = ? WHERE cpf = ?";
				
				Connection conexaoRecebida = null; // recebe a conexao
				PreparedStatement declaracaoComando = null; // preparação do comando
		
		try {
					
			conexaoRecebida = fabricaConexao.criarConexao();
					
			declaracaoComando = (PreparedStatement)conexaoRecebida.prepareStatement(comandoSqlUpdate); //Preparação do comando recebendo o banco com o comando sql
			
			declaracaoComando.setString(1, convidadoNovo.getCpf());
			declaracaoComando.setString(2, convidadoNovo.getNome());
			declaracaoComando.setString(3, convidadoNovo.getEndereco());
			declaracaoComando.setString(4, convidadoNovo.getProfissao());
			declaracaoComando.setString(5, convidadoNovo.getEmail());
			declaracaoComando.setString(6, convidadoNovo.getConvite());
			
			declaracaoComando.setString(7, convidadoNovo.getCpf());
				
			declaracaoComando.execute();
			
			alteracao = true;
			System.out.println("Convidado Alterado com sucesso!!!");			
			logCrudConvidado.gravarArquivoLogConvidado(convidadoNovo, "Alterar");
		
	    } catch (Exception e) {
			
	    	System.out.println(e);
	    	System.out.println("ERRO para Altera Convidado!!!");
	    	alteracao = false;
		
	    } finally { // Executar depois de verificar o try
	    	
	    	try { //Fecha conexao
	    		
	    		if (conexaoRecebida != null) {
	    			conexaoRecebida.close();
	    		}
	    		
	    		if (declaracaoComando != null) {
	    			declaracaoComando.close();
	    		}
	    	} catch (Exception e) {

	    		System.out.println(e);
				System.out.println("ERRO ao fechar a conexao!!!");
			}
			
		}
		
		return alteracao;	
	
	}
}