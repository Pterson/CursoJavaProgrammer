package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorTelaCadastroConvidado;
import controladores.ControladorTelaListarConvidados;
import repositorio.RepositorioConvidado;

public class TelaCadastroConvidado {
	
	public void cadastrarConvidado(JFrame menuPrincipal, RepositorioConvidado repositorioConvidado) {
		
		String nome = "Digite o nome:";		
		String endereco = "Digite o endereço:";
		String profissao = "Digite a profissão:";
		String convite = "Digite o convite:";
		
		JFrame frameTelaCadastroConvidado = new JFrame();	
		frameTelaCadastroConvidado.setSize(400, 250);
		frameTelaCadastroConvidado.setTitle("Tela Cadastro Convidado");
		frameTelaCadastroConvidado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panelTelaCadastroConvidado = new JPanel();
		
		
		GridLayout grid = new GridLayout (0,1);
		panelTelaCadastroConvidado.setLayout(grid);
		
		
		JLabel labelNome = new JLabel(nome);
		panelTelaCadastroConvidado.add(labelNome);
		
		JTextField textNome = new  JTextField(10);
		panelTelaCadastroConvidado.add(textNome);
		
		JLabel labelEndereco = new JLabel(endereco);
		panelTelaCadastroConvidado.add(labelEndereco);
		
		JTextField textEndereco = new  JTextField(10);
		panelTelaCadastroConvidado.add(textEndereco);
		
		JLabel labelProfissao = new JLabel(profissao);
		panelTelaCadastroConvidado.add(labelProfissao);
		
		JTextField textProfissao = new  JTextField(10);
		panelTelaCadastroConvidado.add(textProfissao);
		
		JLabel labelConvite = new JLabel(convite);
		panelTelaCadastroConvidado.add(labelConvite);
		
		JTextField textConvite = new  JTextField(10);
		panelTelaCadastroConvidado.add(textConvite);
		
		
		JButton buttonTelaCadastroConvidado = new JButton("Enviar");
		panelTelaCadastroConvidado.add(buttonTelaCadastroConvidado);
		
		JButton voltarTelaListarConvidados = new JButton("Voltar ao Menu");
		panelTelaCadastroConvidado.add(voltarTelaListarConvidados);
		
		
		frameTelaCadastroConvidado.add(panelTelaCadastroConvidado);
		frameTelaCadastroConvidado.setVisible(true);
		
		ControladorTelaCadastroConvidado controladorTelaCadastroConvidado = new ControladorTelaCadastroConvidado(textNome, textEndereco, textProfissao, textConvite, menuPrincipal, frameTelaCadastroConvidado, repositorioConvidado);
		buttonTelaCadastroConvidado.addActionListener(controladorTelaCadastroConvidado);
		
		ControladorTelaListarConvidados controladorTelaListarConvidados = new ControladorTelaListarConvidados(menuPrincipal, frameTelaCadastroConvidado);
		voltarTelaListarConvidados.addActionListener(controladorTelaListarConvidados);
	}

}
