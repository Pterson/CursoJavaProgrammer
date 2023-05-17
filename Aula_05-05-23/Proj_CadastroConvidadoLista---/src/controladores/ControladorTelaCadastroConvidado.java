package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidades.Convidado;
import repositorio.RepositorioConvidado;

public class ControladorTelaCadastroConvidado implements ActionListener{
	
	JTextField nomeRecebido;
	JTextField enderecoRecebido;
	JTextField profisaoRecebido;
	JTextField conviteRecebido;
    
	JFrame telaMenuPrincipalRecebido;
	JFrame telaCadastroConvidadoRecebido;
	RepositorioConvidado repositorioConvidadoRecebido;
	
	

	public ControladorTelaCadastroConvidado(JTextField nomeRecebido, JTextField enderecoRecebido,
			JTextField profisaoRecebido, JTextField conviteRecebido, JFrame telaMenuPrincipalRecebido,
			JFrame telaCadastroConvidadoRecebido, RepositorioConvidado repositorioConvidado) {
				
		this.nomeRecebido = nomeRecebido;
		this.enderecoRecebido = enderecoRecebido;
		this.profisaoRecebido = profisaoRecebido;
		this.conviteRecebido = conviteRecebido;
		this.telaMenuPrincipalRecebido = telaMenuPrincipalRecebido;
		this.telaCadastroConvidadoRecebido = telaCadastroConvidadoRecebido;
		this.repositorioConvidadoRecebido = repositorioConvidado;
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		
		repositorioConvidadoRecebido.salvarConvidado(popularConvidado());		
		telaMenuPrincipalRecebido.setVisible(true);
		telaCadastroConvidadoRecebido.setVisible(false);
		
	}





	public Convidado popularConvidado() {
		
		Convidado convidado = new Convidado();
		
		convidado.setNome(nomeRecebido.getText());
		convidado.setEndereco(enderecoRecebido.getText());
		convidado.setProfissao(profisaoRecebido.getText());
		convidado.setConvite(conviteRecebido.getText());
				
		return convidado;
	}
		

     

}
