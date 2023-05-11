package principal;

import java.sql.Connection;

import javax.swing.JOptionPane;

import persistencia.FabricaConexao;
import telas.TelaMenuPrincipal;

public class Principal {

	public static void main(String[] args) {
				
	/*	TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal();
		telaMenuPrincipal.menuPrincipal(); */
		
		
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		
		Connection conexaoRecebida = fabricaConexao.criarConexao();
		
		if (conexaoRecebida != null) {
			JOptionPane.showConfirmDialog(null, "Deu BOM");
		}
		
		if (conexaoRecebida == null) {
			JOptionPane.showConfirmDialog(null, "Deu RUIM");			
		}
	
	}

}
