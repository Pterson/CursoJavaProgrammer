package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

import entidades.ConvidadoSimples;
import entidades.ConvidadoVip;

public class DadosRegistrados {
	
//1======METODO CADASTRO CONVIDADO VIP NO BUFFER========================================================================================
	
	public void RegistrarConvVipBU(ConvidadoVip convidadoVip) {
		
		String caminhoUNC ="D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_12-04-23\\Proj_cadastroConvidado\\registrosSavos_BUFFER\\convidadoVip.txt";
		
		try {
			
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(caminhoUNC, true));			
			                                                   
			bufferedwriter.append("NOME: " + convidadoVip.getNome() );
			bufferedwriter.newLine();
			bufferedwriter.append("CPF: " + convidadoVip.getCpf());
			bufferedwriter.newLine();
			bufferedwriter.append("TIPO: " + convidadoVip.getTipoVip());
			bufferedwriter.close();
			
			JOptionPane.showMessageDialog(null, "Convidado Salvo!!!");
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "**ERRO** ao salvar Convidado!!!");
			 e.printStackTrace();
		}
	
	}
	
//1___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________	
	
	
	
	
		
//2======METODO CADASTRO CONVIDADO SIMPLES NO BUFFER========================================================================================
		
	public void RegistrarConvSimplesBU(ConvidadoSimples convidadoSimples) {
		
		String caminhoUNC ="D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_12-04-23\\Proj_cadastroConvidado\\registrosSavos_BUFFER\\convidadoSimples.txt";
		
		try {
			
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(caminhoUNC, true));		
			                                                   
			bufferedwriter.append("NOME: " + convidadoSimples.getNome());
			bufferedwriter.newLine();
			bufferedwriter.append("CPF: " + convidadoSimples.getCpf());
			bufferedwriter.newLine();
			bufferedwriter.append("TIPO: " + convidadoSimples.getTipoNormal());
			bufferedwriter.close();
			
			JOptionPane.showMessageDialog(null, "Convidado Salvo!!!");
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "**ERRO** ao salvar Convidado!!!");
			 e.printStackTrace();
		}
		
	}
//2___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________	
	
}// FECHANDO P.C
