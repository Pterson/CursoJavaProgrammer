package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import telas.TelaCadastroGerente;

public class ControladorMenuGerente implements ActionListener{
	
//______DECLARANDO VARIÁVEIS	
		JTextField textRespostaRecebida;
		JFrame frameMenuGerenteRecebido;


//_____CRIA INSTANCIA telaCadastroGerente
		TelaCadastroGerente telaCadastroGerente = new TelaCadastroGerente();
		

//_____CONSTRUTOR DA CLASSE ControladorMenuGerente
	   public ControladorMenuGerente(JTextField textRespostaRecebida, JFrame frameMenuGerente) {
			
			this.textRespostaRecebida = textRespostaRecebida;
			this.frameMenuGerenteRecebido = frameMenuGerente;
			
		}
	   
	   

//_____IMPLEMENTAÇÃO DO METODO EM CONJUNTO COM A ACTIONLISTENER	
		@Override
		public void actionPerformed(ActionEvent e) {
			String resposta = textRespostaRecebida.getText();
			
			if (resposta.equals("1") || resposta.equals("2") ) {
				
				switch (resposta) {
				case "1":
					telaCadastroGerente .telaCadastrarGerente();
					frameMenuGerenteRecebido.setVisible(false);
					break;
				case "2":
					System.out.println("ATIVIDADE NÃO DEFINIDA");
					break;
					
				}
			}else {
			
				System.out.println("Invalido");
			
			}
			
		}		
}
