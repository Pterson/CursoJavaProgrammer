package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Convidado;
import repositorio.RepositorioConvidado;
import telas.TelaFormularioAlterarConvidado;


public class ControladorTelaLocalizaAlterarConvidado implements ActionListener{
	
	JFrame menuPrincipalRecebido;
	JFrame frameAlterarRecebido;	
	RepositorioConvidado RepositorioConvidadoRecebido;
	JTextField textConviteRecebido;
	

	public ControladorTelaLocalizaAlterarConvidado(JFrame menuPrincipalRecebido, JFrame frameAlterarRecebido,
			RepositorioConvidado repositorioConvidadoRecebido, JTextField textConviteRecebido) {
		super();
		this.menuPrincipalRecebido = menuPrincipalRecebido;
		this.frameAlterarRecebido = frameAlterarRecebido;
		RepositorioConvidadoRecebido = repositorioConvidadoRecebido;
		this.textConviteRecebido = textConviteRecebido;
	}
	
	
	TelaFormularioAlterarConvidado formularioAlterarConvidado = new TelaFormularioAlterarConvidado();

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String botao = e.getActionCommand(); //Identificará qual dos botões foi pressionado
		
		//Condição para o botão ALTERAR ao ser acionado
		if(botao.equals("Alterar")) {
			Convidado convidadoAlterar = new Convidado(); // iniciando o objeto convidado que será alterado
			
			convidadoAlterar = RepositorioConvidadoRecebido.buscarConvidado(textConviteRecebido.getText()); //Armazena o convidado que foi encontrado na lista(Retorna null se não encontrar)
			
			//Condição caso o convidado não seja localizado
			if(convidadoAlterar != null) {
				
				formularioAlterarConvidado.formularioAlterarConvidado(convidadoAlterar, menuPrincipalRecebido, RepositorioConvidadoRecebido);//Abre o formulario de edição passando o convidado encontrado como parametro
				frameAlterarRecebido.setVisible(false);	//Fecha a tela de selecionar o convidado que vai ser alterado
				
			}else {
				JOptionPane.showMessageDialog(null, "O convidado não foi encontrado");
			}
			
		}

		//Condição para o botão VOLTAR ao ser acionado
		if (botao.equals("Voltar")) {
			menuPrincipalRecebido.setVisible(true);
			frameAlterarRecebido.setVisible(false);
	}
	
	
	
	
	}
}
