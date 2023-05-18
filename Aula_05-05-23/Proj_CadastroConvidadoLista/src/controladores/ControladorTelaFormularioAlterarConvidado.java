package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidades.Convidado;
import repositorio.RepositorioConvidado;

public class ControladorTelaFormularioAlterarConvidado implements ActionListener{
	
	
	JFrame frameMenuInicial;
	JFrame frameFormularioAlterar;
	JTextField textCpfRecebido;
	JTextField textNomeRecebido;	
	JTextField textEnderecoRecebido;
	JTextField textProfissaoRecebido;
	JTextField textEmailRecebido;
	JTextField textConviteRecebido;
	RepositorioConvidado repositorioConvidadoRecebido;
	Convidado convidadoAtual;
	
	
	public ControladorTelaFormularioAlterarConvidado(JFrame frameMenuInicial, JFrame frameFormularioAlterar,
			JTextField textCpfRecebido, JTextField textNomeRecebido, JTextField textEnderecoRecebido,
			JTextField textProfissaoRecebido, JTextField textEmailRecebido, JTextField textConviteRecebido,
			RepositorioConvidado repositorioConvidadoRecebido, Convidado convidadoAtual) {
		super();
		this.frameMenuInicial = frameMenuInicial;
		this.frameFormularioAlterar = frameFormularioAlterar;
		this.textCpfRecebido = textCpfRecebido;
		this.textNomeRecebido = textNomeRecebido;
		this.textEnderecoRecebido = textEnderecoRecebido;
		this.textProfissaoRecebido = textProfissaoRecebido;
		this.textEmailRecebido = textEmailRecebido;
		this.textConviteRecebido = textConviteRecebido;
		this.repositorioConvidadoRecebido = repositorioConvidadoRecebido;
		this.convidadoAtual = convidadoAtual;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		repositorioConvidadoRecebido.alterarConvidado(popularConvidadoNovo());
		
		frameMenuInicial.setVisible(true);
		
		frameFormularioAlterar.setVisible(false);
	}
		public Convidado popularConvidadoNovo() {
			Convidado convidadoNovo = new Convidado();
			
			convidadoNovo.setCpf(textCpfRecebido.getText());
			convidadoNovo.setNome(textNomeRecebido.getText());			
			convidadoNovo.setEndereco(textEnderecoRecebido.getText());
			convidadoNovo.setProfissao(textProfissaoRecebido.getText());
			convidadoNovo.setEmail(textEmailRecebido.getText());
			convidadoNovo.setConvite(textConviteRecebido.getText());
			
			return convidadoNovo;
		}
		
}



