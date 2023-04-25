package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorMenuGerente;

public class TelaMenuGerente {
	
	public void menuGerente() {
		
	
//______VARIÁVEIS DEFINIDAS COM MENSAGENS QUE SERÃO EXIBIDAS PARA O USUÁRIO			
		String opcao1 = "1 -> Cadastrar Gerente";
		String opcao2 = "2 -> Visualizar Gerente";	
		
		
		
//______CRIA O FRAME		
		JFrame frameMenuGerente = new JFrame();
				
		frameMenuGerente.setSize(200, 200);
		frameMenuGerente.setTitle("MENU GERENTE");
				
				
//______CRIA O PAINEL		
		JPanel panelMenuGerente = new JPanel();
		
		
//______CRIA O LABEL		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuGerente.add(labelOpcao1);
				
		JLabel labelOpcao2 = new JLabel(opcao2); 
		panelMenuGerente.add(labelOpcao2);
		
		
		
//______CRIA O CAMPO DO TEXTO	
		JTextField textResposta = new JTextField(10);
		panelMenuGerente.add(textResposta);
				
				
//______CRIA O BOTÃO		
		JButton botaoEnviar = new JButton("Enviar");
		panelMenuGerente.add(botaoEnviar);
		
		
//______ADICIONA O PANELMENUGERENTE NO FRAMEMENUGERENTE		
		frameMenuGerente.add(panelMenuGerente);
		frameMenuGerente.setVisible(true);
		
		
		
//______CRIA INSTANCIA DO CONSTRUTOR COM DOIS PARAMENTROS SETADOS_________________________________________________________		
		ControladorMenuGerente controladorMenuGerente = new ControladorMenuGerente(textResposta, frameMenuGerente);
		botaoEnviar.addActionListener(controladorMenuGerente);	
		
		
	}

}//FECHA CLASSE
