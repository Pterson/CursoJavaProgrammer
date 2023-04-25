package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import telas.TelaCadastroCoordenador;


public class ControladorMenuCoordenador implements ActionListener{

//______DECLARANDO VARIÁVEIS	
		JTextField textRespostaRecebida;
		JFrame frameMenuCoordenadorRecebido;
		
		
//_____CRIA INSTANCIA telaCadastroCoordenador
		TelaCadastroCoordenador telaCadastroCoordenador = new TelaCadastroCoordenador();

		
//_____CONSTRUTOR DA CLASSE ControladorMenuCoordenador
	public ControladorMenuCoordenador(JTextField textRespostaRecebida, JFrame frameMenuCoordenador) {
		
		this.textRespostaRecebida = textRespostaRecebida;
		this.frameMenuCoordenadorRecebido = frameMenuCoordenador;		
	}
	

//_____IMPLEMENTAÇÃO DO METODO EM CONJUNTO COM A ACTIONLISTENER	
	@Override
	public void actionPerformed(ActionEvent e) {
		String resposta = textRespostaRecebida.getText();
		
		if (resposta.equals("1") || resposta.equals("2") ) {
			
			switch (resposta) {
			case "1":
				telaCadastroCoordenador.telaCadastrarCoordenador();
				frameMenuCoordenadorRecebido.setVisible(false);
				break;
			case "2":
				System.out.println("ATIVIDADE NÃO DEFINIDA");
				break;
				
				
			/*case "2":
			    TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(); // cria um novo objeto da classe TelaMenuPrincipal
			    telaMenuPrincipal.menuPrincipal(); // exibe a tela do menu principal
			    frameMenuCoordenadorRecebido.dispose(); // fecha a tela atual do menu do coordenador
			    break;*/

			}
		}else {
		
			System.out.println("Invalido");
		
		}
		
	}
	
}
