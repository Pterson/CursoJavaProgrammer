package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Convidado;
import repositorio.RepositorioConvidado;
import validacao.ValidaConvidado;

public class ControladorTelaCadastroConvidado implements ActionListener{
	
	JTextField cpfRecebido;
	JTextField nomeRecebido;
	JTextField enderecoRecebido;
	JTextField profisaoRecebido;
	JTextField emailRecebido;
	JTextField conviteRecebido;
    
	
	JFrame telaMenuPrincipalRecebido;
	JFrame telaCadastroConvidadoRecebido;
	RepositorioConvidado repositorioConvidadoRecebido;
	ValidaConvidado validaConvidado = new ValidaConvidado(); 
	
	String mensagemErro;

	

	public ControladorTelaCadastroConvidado(JTextField cpfRecebido, JTextField nomeRecebido,
			JTextField enderecoRecebido, JTextField profisaoRecebido, JTextField emailRecebido,
			JTextField conviteRecebido, JFrame telaMenuPrincipalRecebido, JFrame telaCadastroConvidadoRecebido,
			RepositorioConvidado repositorioConvidadoRecebido) {
		
		this.cpfRecebido = cpfRecebido;
		this.nomeRecebido = nomeRecebido;
		this.enderecoRecebido = enderecoRecebido;
		this.profisaoRecebido = profisaoRecebido;
		this.emailRecebido = emailRecebido;
		this.conviteRecebido = conviteRecebido;
		this.telaMenuPrincipalRecebido = telaMenuPrincipalRecebido;
		this.telaCadastroConvidadoRecebido = telaCadastroConvidadoRecebido;
		this.repositorioConvidadoRecebido = repositorioConvidadoRecebido;
	}

	

	
//	ValidaConvidado validaConvidado = new ValidaConvidado();
	
//	boolean validaConvidado = true;



	@Override
	public void actionPerformed(ActionEvent e) {
		
		repositorioConvidadoRecebido.salvarConvidado(popularConvidado());		
		telaMenuPrincipalRecebido.setVisible(true);
		telaCadastroConvidadoRecebido.setVisible(false);
		
	}


	public Convidado popularConvidado() {
		
		Convidado convidado = new Convidado();
		

		convidado.setCpf(cpfRecebido.getText());
		convidado.setNome(nomeRecebido.getText());
		convidado.setEndereco(enderecoRecebido.getText());
		convidado.setProfissao(profisaoRecebido.getText());
		convidado.setEmail(emailRecebido.getText());
		convidado.setConvite(conviteRecebido.getText());
		
		mensagemErro = validaConvidado.retornaMensagemErro(convidado);
		
		if(mensagemErro == null) {
			
			JOptionPane.showMessageDialog(null, "Convidado Validado!!");
			return convidado;
			
		} else {

			JOptionPane.showMessageDialog(null, mensagemErro);
			return null;
		}	

	}    

}
