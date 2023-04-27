package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorMenuCoordenador;

public class TelaMenuCoordenador {
	
	public void menuCoordenador() {
	
//______VARIÁVEIS DEFINIDAS COM MENSAGENS QUE SERÃO EXIBIDAS PARA O USUÁRIO			
		String opcao1 = "1 -> Cadastrar Coordenador";
		String opcao2 = "2 -> Visualizar Coordenador";

//______CRIA O FRAME		
		JFrame frameMenuCoordenador = new JFrame();
		
		frameMenuCoordenador.setSize(200, 200);
		frameMenuCoordenador.setTitle("MENU COORDENADOR");
		
		
//______CRIA O PAINEL		
		JPanel panelMenuCoordenador = new JPanel();
		
	
//______CRIA O LABEL		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuCoordenador.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2); 
		panelMenuCoordenador.add(labelOpcao2);
		
		
//______CRIA O CAMPO DO TEXTO	
		JTextField textResposta = new JTextField(10);
		panelMenuCoordenador.add(textResposta);
		
		
//______CRIA O BOTÃO		
		JButton botaoEnviar = new JButton("Enviar");
		panelMenuCoordenador.add(botaoEnviar);
		
		
//______ADICIONA O PANELMENUCOORDENADOR NO FRAMEMENUCOORDENADOR
		frameMenuCoordenador.add(panelMenuCoordenador);
		frameMenuCoordenador.setVisible(true);
		

//______CRIA INSTANCIA DO CONSTRUTOR COM DOIS PARAMENTROS SETADOS_________________________________________________________		
		ControladorMenuCoordenador controladorMenuCoordenador = new ControladorMenuCoordenador(
				textResposta, frameMenuCoordenador);
		botaoEnviar.addActionListener(controladorMenuCoordenador);	
		
	}

}//FECHA CLASSE
