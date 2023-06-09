package telas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controladores.ControladorTelaLocalizaAlterarConvidado;
import entidades.Convidado;
import repositorio.RepositorioConvidado;

public class TelaLocalizaAlterarConvidado {
	
	public void criarTelaLocalizaAlterarConvidado(List<Convidado> listaConvidados, JFrame telaListaConvidados, RepositorioConvidado repositorioConvidado) {
		
		int qtdLinhas = listaConvidados.size();
		
		String [][] tabelaString  = new String [qtdLinhas][6];
		
		int posicaoColuna = 0;
		int posicaoLinha = 0;
		
		for (Convidado convidado: listaConvidados) {
			
			tabelaString [posicaoLinha][posicaoColuna] = convidado.getCpf();			
			posicaoColuna++; // ESTÁ LÓGICA PODE SER REESCRITA: posicaoColuna = posicaoColuna + 1
			
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
		
		JFrame frameAlterarConvidados = new JFrame();
		frameAlterarConvidados.setSize(500,600);
		frameAlterarConvidados.setTitle("Tela Alteração Convidados");
		
		JTable tabelaConvidados = new JTable(tabelaString, nomesColunas);
		
		tabelaConvidados.setBounds(30, 40, 300, 300);
		
		JPanel panelAlterarConvidados = new JPanel();
		
		JScrollPane scrollPaneAlterarConvidados = new JScrollPane(tabelaConvidados);		
		panelAlterarConvidados.add(scrollPaneAlterarConvidados);
		
		JLabel labelCpf = new JLabel("Digite o CPF para alterar:");
		panelAlterarConvidados.add(labelCpf);
		
		JTextField textCpfDelete = new JTextField(10);
		panelAlterarConvidados.add(textCpfDelete);
		
		JButton alterarTelaAlterarConvidado = new JButton("Alterar");
		panelAlterarConvidados.add(alterarTelaAlterarConvidado);
		
		JButton voltarTelaAlterarConvidado = new JButton("Voltar");
		panelAlterarConvidados.add(voltarTelaAlterarConvidado);
		
		frameAlterarConvidados.add(panelAlterarConvidados);
		frameAlterarConvidados.setVisible(true);
		
		ControladorTelaLocalizaAlterarConvidado alterarConvidado = new ControladorTelaLocalizaAlterarConvidado (textCpfDelete, telaListaConvidados, frameAlterarConvidados, repositorioConvidado);
		
		alterarTelaAlterarConvidado.addActionListener(alterarConvidado);
		voltarTelaAlterarConvidado.addActionListener(alterarConvidado);
	}

}
