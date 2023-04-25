package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorMenuAtendente;


public class TelaMenuAtendente {
	
	public void menuAtendente() {
		

//______VARIÁVEIS DEFINIDAS COM MENSAGENS QUE SERÃO EXIBIDAS PARA O USUÁRIO		
		String opcao1 = "1 -> Cadastrar Atendente";
		String opcao2 = "2 -> Visualizar Atendente";
		

//______CRIA O FRAME		
		JFrame frameMenuAtendente = new JFrame();
		
		
//______DEFINI TAMANHO DO LAYOUT FRAME
		frameMenuAtendente.setSize(200, 200);
		
		
//______EXIBE TÍTULO O NO FRAME
		frameMenuAtendente.setTitle("MENU ATENDENTE");
		
		
//______CRIA O PAINEL		
		JPanel panelMenuAtendente = new JPanel();
		
		
		
//______CRIA O LABEL		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuAtendente.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2); 
		panelMenuAtendente.add(labelOpcao2);
		
		
//______CRIA O CAMPO DO TEXTO	
		JTextField textResposta = new JTextField(10);
		panelMenuAtendente.add(textResposta);
		
		
//______CRIA O BOTÃO		
		JButton botaoEnviar = new JButton("Enviar");
		panelMenuAtendente.add(botaoEnviar);
		
		
//______ADICIONA O PANELMENUCOORDENADOR NO FRAMEMENUCOORDENADOR		
		frameMenuAtendente.add(panelMenuAtendente);
		frameMenuAtendente.setVisible(true);
		
		
//______CRIA INSTANCIA DO CONSTRUTOR COM DOIS PARAMENTROS SETADOS_________________________________________________________		
		ControladorMenuAtendente controladorMenuAtendente = new ControladorMenuAtendente(textResposta, frameMenuAtendente);
				botaoEnviar.addActionListener(controladorMenuAtendente);	
				
	}	

}//Fecha Classe
