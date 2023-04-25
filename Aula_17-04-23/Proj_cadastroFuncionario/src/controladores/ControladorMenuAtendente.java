package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import telas.TelaCadastroAtendente;



public class ControladorMenuAtendente implements ActionListener{
	
//______Declarando variáveis	
		JTextField textRespostaRecebida;
		JFrame frameMenuAtendenteRecebido;
	

//______CRIA INSTANCIA telaCadastroAtendente
		TelaCadastroAtendente telaCadastroAtendente = new TelaCadastroAtendente();
		
		
//_____CONSTRUTOR DA CLASSE ControladorMenuCoordenador		
		public ControladorMenuAtendente(JTextField textRespostaRecebida, JFrame frameMenuAtendente) {
			
			this.textRespostaRecebida = textRespostaRecebida;
			this.frameMenuAtendenteRecebido = frameMenuAtendente;		
		}

		
		
//_____IMPLEMENTAÇÃO DO METODO EM CONJUNTO COM A ACTIONLISTENER	
		@Override
		public void actionPerformed(ActionEvent e) {
			String resposta = textRespostaRecebida.getText();
			
			if (resposta.equals("1") || resposta.equals("2") ) {
				
				switch (resposta) {
				case "1":
					telaCadastroAtendente.telaCadastrarAtendente();
					frameMenuAtendenteRecebido.setVisible(false);
					break;
				case "2":
					System.out.println("ATIVIDADE NÃO DEFINIDA");
					break;	

				}
			}else {
			
				System.out.println("Invalido");
			
			}
			
		}


}//Fechando Classe
