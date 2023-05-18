package telas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controladores.ControladorTelaDeletarConvidados;
import entidades.Convidado;
import repositorio.RepositorioConvidado;

public class TelaDeletarConvidados {
	
	public void deletarConvidados(List<Convidado> listaConvidados, JFrame menuPrincipal, RepositorioConvidado repositorioConvidado) {
		
        int qtdLinhas = listaConvidados.size(); // Logica para contagem de linhas, se baseia no numero de inserções de convidados
		
		String [][] tabelaString  = new String [qtdLinhas][6];
		
		int posicaoColuna = 0; // Inicia a contagem do indice 0
		int posicaoLinha = 0;
		
		for (Convidado convidado: listaConvidados) {
			
			tabelaString [posicaoLinha][posicaoColuna] = convidado.getCpf();			
			posicaoColuna++;			
			
			tabelaString [posicaoLinha][posicaoColuna] = convidado.getNome();			
			posicaoColuna++;
			
			tabelaString [posicaoLinha][posicaoColuna] = convidado.getEndereco();			
			posicaoColuna++;
			
			tabelaString [posicaoLinha][posicaoColuna] = convidado.getProfissao();
			posicaoColuna++;
			
			tabelaString [posicaoLinha][posicaoColuna] = convidado.getEmail();			
			posicaoColuna++;
			
			tabelaString [posicaoLinha][posicaoColuna] = convidado.getConvite();
			posicaoLinha++;
			posicaoColuna = 0;
		}
		
		
		String nomesColunas[] = {"CPF", "NOME", "ENDEREÇO", "PROFISSÃO", "EMAIL", "CONVITE"};
		
		JFrame frameDeletarConvidados = new JFrame();
		frameDeletarConvidados.setSize(500,600);
		frameDeletarConvidados.setTitle("Tela Exclusão de Convidados");
		
		JTable tabelaConvidados = new JTable(tabelaString, nomesColunas); // A TABELA RECEBE O NOME/TITULOS COMO STRING		
		
		tabelaConvidados.setBounds(30, 40, 300, 300); //DIMENSÕES: posicaoLinha, qtdLinhas, posicaoColuna, posicaoLinha
		
		JScrollPane scrollPaneListarConvidados = new JScrollPane(tabelaConvidados);
		
		JPanel panelListarConvidados = new JPanel();
		
		
	    JLabel labelCpf= new JLabel("Insirá o CPF para deletar:");
	    panelListarConvidados.add(labelCpf);
	    
	    JTextField textCpf = new JTextField(10);
	    panelListarConvidados.add(textCpf);		
		
		
		panelListarConvidados.add(scrollPaneListarConvidados);
		
		JButton deletarTelaConvidados = new JButton("Deletar");
		panelListarConvidados.add(deletarTelaConvidados);
		
		JButton voltarTelaDeletarJogador = new JButton("Voltar");
		panelListarConvidados.add(voltarTelaDeletarJogador);
		
		frameDeletarConvidados.add(panelListarConvidados);
		frameDeletarConvidados.setVisible(true);
		
		
		ControladorTelaDeletarConvidados controladorTelaDeletarConvidados = new ControladorTelaDeletarConvidados(menuPrincipal, frameDeletarConvidados, textCpf, repositorioConvidado);
		
		
		deletarTelaConvidados.addActionListener(controladorTelaDeletarConvidados);
		voltarTelaDeletarJogador.addActionListener(controladorTelaDeletarConvidados);
		
		
		
	}


}
