package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Convidado;
import repositorio.RepositorioConvidado;

public class ControladorTelaDeletarConvidados implements ActionListener{
	
	JFrame menuPrincipalRecebido;
	JFrame frameDeletarRecebido;	
	JTextField textCpfRecebido;	
	RepositorioConvidado repositorioConvidadoRecebido;
	


	public ControladorTelaDeletarConvidados(JFrame menuPrincipalRecebido, JFrame frameDeletarRecebido,
			JTextField textCpfRecebido, RepositorioConvidado repositorioConvidadoRecebido) {
		
		this.menuPrincipalRecebido = menuPrincipalRecebido;
		this.frameDeletarRecebido = frameDeletarRecebido;
		this.textCpfRecebido = textCpfRecebido;
		this.repositorioConvidadoRecebido = repositorioConvidadoRecebido;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		String botao = e.getActionCommand();
		
		if(botao == "Deletar") {
			
			Convidado convidadoDelete = new Convidado();
			
			convidadoDelete = repositorioConvidadoRecebido.buscarConvidado(textCpfRecebido.getText());
			
			if(convidadoDelete != null) {
				repositorioConvidadoRecebido.deletarConvidado(convidadoDelete);
				JOptionPane.showMessageDialog(null, "Convidado Deletado!!!");
				frameDeletarRecebido.setVisible(false);
				menuPrincipalRecebido.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Convidado Inexistente!!!");
			}
			
		    }else {
		    	frameDeletarRecebido.setVisible(false);
				menuPrincipalRecebido.setVisible(true);
		    }		
	}	
}
