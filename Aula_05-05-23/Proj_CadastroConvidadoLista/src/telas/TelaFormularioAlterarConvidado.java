package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorTelaFormularioAlterarConvidado;
import entidades.Convidado;
import repositorio.RepositorioConvidado;

public class TelaFormularioAlterarConvidado {

	public void formularioAlterarConvidado(Convidado convidadoEncontrado, JFrame frameMenuPrincipal, RepositorioConvidado repositorioConvidadoRecebido) {
		
		String nome = "Digite o nome:";	
		String endereco = "Digite o endereço:";
		String profissao = "Digite a profissão:";
		String convite = "Digite o convite:";
		
		JFrame frameFormularioAlterarConvidado = new JFrame();	
		frameFormularioAlterarConvidado.setSize(400, 250);
		frameFormularioAlterarConvidado.setTitle("Tela Cadastro Convidado");
		frameFormularioAlterarConvidado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panelFormularioAlterar = new JPanel();
		GridLayout grid = new GridLayout (0,1);
		panelFormularioAlterar.setLayout(grid);
		
		
		JLabel labelNome = new JLabel(nome);
		panelFormularioAlterar.add(labelNome);
		
		JTextField textNome = new  JTextField(10);
		textNome.setText(convidadoEncontrado.getNome()); // Adicionará o nome do convidado encontrado no Campo de texto do nome
		panelFormularioAlterar.add(textNome);
			
		
		JLabel labelEndereco = new JLabel(endereco);
		panelFormularioAlterar.add(labelEndereco);
		
		JTextField textEndereco = new  JTextField(10);
		textEndereco.setText(convidadoEncontrado.getEndereco());
		panelFormularioAlterar.add(textEndereco);
		
		
		JLabel labelProfissao = new JLabel(profissao);
		panelFormularioAlterar.add(labelProfissao);
		
		JTextField textProfissao = new  JTextField(10);
		textProfissao.setText(convidadoEncontrado.getProfissao());
		panelFormularioAlterar.add(textProfissao);
		
		
		JLabel labelConvite = new JLabel(convite);
		panelFormularioAlterar.add(labelConvite);
		
		JTextField textConvite = new  JTextField(10);		
		textConvite.setText(convidadoEncontrado.getConvite()); // Adicionará o convite do convidado encontrado no Campo de texto do nome		
		textConvite.setEditable(false); // Com esse parametro false não é possivel alterar o campo
		panelFormularioAlterar.add(textConvite);
		
		
		JButton buttonTelaCadastroConvidado = new JButton("Alterar Convidado");
		panelFormularioAlterar.add(buttonTelaCadastroConvidado);
		frameFormularioAlterarConvidado.add(panelFormularioAlterar);
		frameFormularioAlterarConvidado.setVisible(true);
		
		ControladorTelaFormularioAlterarConvidado controladorTelaFormularioAlterarConvidado = new ControladorTelaFormularioAlterarConvidado(
		frameMenuPrincipal, frameFormularioAlterarConvidado, textNome, textEndereco, textProfissao, textConvite, repositorioConvidadoRecebido, convidadoEncontrado);
		buttonTelaCadastroConvidado.addActionListener(controladorTelaFormularioAlterarConvidado);
	
	}
}
