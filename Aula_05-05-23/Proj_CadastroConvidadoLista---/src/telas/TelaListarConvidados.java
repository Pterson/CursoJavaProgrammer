package telas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controladores.ControladorTelaListarConvidados;
import entidades.Convidado;

public class TelaListarConvidados {
	
	public void listarConvidados(List<Convidado> listaConvidados, JFrame telaListaConvidados) {
		
		int qtdLinhas = listaConvidados.size(); // Logica para contagem de linhas, se baseia no numero de inserções de convidados
		
		String [][] tabelaString  = new String [qtdLinhas][4];
		
		int posicaoColuna = 0; // Inicia a contagem do indice 0
		int posicaoLinha = 0; 
		
		for (Convidado convidado: listaConvidados) {
			
			tabelaString [posicaoLinha][posicaoColuna] = convidado.getNome();			
			posicaoColuna++; // ESTÁ LÓGICA PODE SER REESCRITA: posicaoColuna = posicaoColuna + 1
			
			tabelaString [posicaoLinha][posicaoColuna] = convidado.getEndereco();			
			posicaoColuna++;
			
			tabelaString [posicaoLinha][posicaoColuna] = convidado.getProfissao();
			posicaoColuna++;
			
			tabelaString [posicaoLinha][posicaoColuna] = convidado.getConvite();
			posicaoLinha++;
			posicaoColuna = 0;
		}
		
		
		String nomesColunas[] = {"NOME", "ENDEREÇO", "PROFISSÃO", "CONVITE"};
		
		JFrame frameListarConvidados = new JFrame();
		frameListarConvidados.setSize(500,600);
		frameListarConvidados.setTitle("Tela Exibição Convidados");
		
		JTable tabelaConvidados = new JTable(tabelaString, nomesColunas); // A TABELA RECEBE O NOME/TITULOS COMO STRING		
		
		tabelaConvidados.setBounds(30, 40, 300, 300); //DIMENSÕES: posicaoLinha, qtdLinhas, posicaoColuna, posicaoLinha
		
		JPanel panelListarConvidados = new JPanel();		
		
		JScrollPane scrollPaneListarConvidados = new JScrollPane(tabelaConvidados);				
		panelListarConvidados.add(scrollPaneListarConvidados);
		
		
		JButton voltarTelaListarConvidados = new JButton("Voltar ao Menu");
		panelListarConvidados.add(voltarTelaListarConvidados);
		
		frameListarConvidados.add(panelListarConvidados);
		frameListarConvidados.setVisible(true);
		
	  ControladorTelaListarConvidados controladorTelaListarConvidados = new ControladorTelaListarConvidados(telaListaConvidados, frameListarConvidados);
		voltarTelaListarConvidados.addActionListener(controladorTelaListarConvidados);
		  
	}

}
