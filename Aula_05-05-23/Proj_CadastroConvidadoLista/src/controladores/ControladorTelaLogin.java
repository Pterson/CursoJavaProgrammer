package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Usuario;
import servico.GerenciaSessao;
import telas.TelaMenuPrincipal;

public class ControladorTelaLogin implements ActionListener {
	
		JTextField textMatriculaRecebida;
		JTextField textSenhaRecebida;
		JFrame frameTelaLoginRecebida;
		
		
		public ControladorTelaLogin(JTextField textMatriculaRecebida, JTextField textSenhaRecebida,
				JFrame frameTelaLoginRecebida) {
			
			this.textMatriculaRecebida = textMatriculaRecebida;
			this.textSenhaRecebida = textSenhaRecebida;
			this.frameTelaLoginRecebida = frameTelaLoginRecebida;
		}
		
		
		GerenciaSessao gerenciaSessao = new GerenciaSessao();
		TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal();


		@Override
		public void actionPerformed (ActionEvent e) {
			
			Usuario usuarioEncontrado = gerenciaSessao.validaUsuario(textMatriculaRecebida.getText(), textSenhaRecebida.getText());
			
			if(usuarioEncontrado != null) {
				
				JOptionPane.showMessageDialog(null,  "Bem Vindo(a) " + usuarioEncontrado.getNome());
				System.out.println("Iniciar Sistema!");
				frameTelaLoginRecebida.setVisible(false);
				
				telaMenuPrincipal.menuPrincipal(usuarioEncontrado);
				
				textSenhaRecebida.setText(null);
				textMatriculaRecebida.setText(null);
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorretos!!");
			}			
		}	
}
