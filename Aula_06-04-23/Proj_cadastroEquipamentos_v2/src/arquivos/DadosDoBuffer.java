package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

import entidade.Furadeira;
import entidade.Makita;

public class DadosDoBuffer {

	
//1======METODO CADASTRO FURADEIRA NO BUFFER========================================================================================

	public void salvaDadosFuradeira(Furadeira furadeira) {

		String caminhoUNC = "D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_06-04-23\\Proj_cadastroEquipamentos_v2\\bin\\arquivos\\dadosFuradeira.txt";

		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminhoUNC));

			bufferedWriter.append("Marca:" + furadeira.getMarca());
			bufferedWriter.newLine();
			bufferedWriter.append("Código:" + furadeira.getCodigo());
			bufferedWriter.newLine();
			bufferedWriter.append("Broca:" + furadeira.getTipoDeBrocas());
			bufferedWriter.newLine();
			bufferedWriter.append("R$ Compra:" + furadeira.getValorDaCompra());
			bufferedWriter.newLine();
			bufferedWriter.append("R$ Venda:" + furadeira.getValorDaVenda());
			bufferedWriter.newLine();			
			bufferedWriter.append(String.valueOf("Lucro:" + furadeira.getLucro()));

			bufferedWriter.close();

			JOptionPane.showMessageDialog(null, "Registro Realizado!!!");

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar!!!");
			e.printStackTrace();
		}
	}
//1___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________	


//2======METODO CADASTRO MAKITA NO BUFFER========================================================================================	
	
	public void salvaDadosMakita(Makita makita) {
		
		String caminhoUNC = "D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_06-04-23\\Proj_cadastroEquipamentos_v2\\bin\\arquivos\\dadosMakita.txt";

		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminhoUNC));
			
			bufferedWriter.append("Marca:" + makita.getMarca());
			bufferedWriter.newLine();		
			bufferedWriter.append("Código:" + makita.getCodigo());
			bufferedWriter.newLine();
			bufferedWriter.append("Disco:" + makita.getTipoDeDiscos());
			bufferedWriter.newLine();
			bufferedWriter.append("R$ Compra:" + makita.getValorDaCompra());
			bufferedWriter.newLine();
			bufferedWriter.append("R$ Venda:" + makita.getValorDaVenda());
			bufferedWriter.newLine();
			bufferedWriter.append(String.valueOf("Lucro:" + makita.getLucro()));

			bufferedWriter.close();
			
			JOptionPane.showMessageDialog(null, "Registro Realizado!!!");

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar!!!");
			e.printStackTrace();
		}
	}
//2___________________________________________________________FINALIZANDO BLOCO_____________________________________________________________________	
	

}
