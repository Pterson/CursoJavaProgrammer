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
		
		String cpf = "Digite o CPF:";
		String nome = "Digite o NOME:";		
		String endereco = "Digite o ENDEREÇO:";
		String profissao = "Digite a PROFISSÃO:";
		String email = "Digite o EMAIL:";
		String convite = "Digite o CONVITE:";
		
		JFrame frameTelaCadastroConvidado = new JFrame();	
		frameTelaCadastroConvidado.setSize(400, 250);
		frameTelaCadastroConvidado.setTitle("Tela Cadastro Convidado");
		frameTelaCadastroConvidado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panelTelaCadastroConvidado = new JPanel();
		
		
		GridLayout grid = new GridLayout (0,1);
		panelTelaCadastroConvidado.setLayout(grid);
		
		//----
		
		JLabel labelCpf = new JLabel(cpf);
		panelTelaCadastroConvidado.add(labelCpf);
		
		JTextField textCpf = new  JTextField(10);
		panelTelaCadastroConvidado.add(textCpf);		
		
		//----
		
		JLabel labelNome = new JLabel(nome);
		panelTelaCadastroConvidado.add(labelNome);
		
		JTextField textNome = new  JTextField(10);
		panelTelaCadastroConvidado.add(textNome);
		
		//----
		
		JLabel labelEndereco = new JLabel(endereco);
		panelTelaCadastroConvidado.add(labelEndereco);
		
		JTextField textEndereco = new  JTextField(10);
		panelTelaCadastroConvidado.add(textEndereco);
		
		//----
		
		JLabel labelProfissao = new JLabel(profissao);
		panelTelaCadastroConvidado.add(labelProfissao);
		
		JTextField textProfissao = new  JTextField(10);
		panelTelaCadastroConvidado.add(textProfissao);
		
		//----
		
		JLabel labelEmail = new JLabel(email);
		panelTelaCadastroConvidado.add(labelEmail);
		
		JTextField textEmail = new  JTextField(10);
		panelTelaCadastroConvidado.add(textEmail);
		
		//----
		
		JLabel labelConvite = new JLabel(convite);
		panelTelaCadastroConvidado.add(labelConvite);
		
		JTextField textConvite = new  JTextField(10);
		panelTelaCadastroConvidado.add(textConvite);
		
		//----
		
		
		JButton buttonTelaCadastroConvidado = new JButton("Enviar");
		panelTelaCadastroConvidado.add(buttonTelaCadastroConvidado);
		
		JButton voltarTelaListarConvidados = new JButton("Voltar ao Menu");
		panelTelaCadastroConvidado.add(voltarTelaListarConvidados);
		
		
		frameTelaCadastroConvidado.add(panelTelaCadastroConvidado);
		frameTelaCadastroConvidado.setVisible(true);
		
		ControladorTelaCadastroConvidado controladorTelaCadastroConvidado = new ControladorTelaCadastroConvidado(textCpf, textNome, textEndereco, textProfissao, textEmail, textConvite, menuPrincipal, frameTelaCadastroConvidado, repositorioConvidado);
		buttonTelaCadastroConvidado.addActionListener(controladorTelaCadastroConvidado);
		
		ControladorTelaListarConvidados controladorTelaListarConvidados = new ControladorTelaListarConvidados(menuPrincipal, frameTelaCadastroConvidado);
		voltarTelaListarConvidados.addActionListener(controladorTelaListarConvidados);
	}

}
