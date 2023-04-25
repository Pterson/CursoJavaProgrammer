package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorMenuPrincipal;

public class TelaMenuPrincipal {
	
	public void menuPrincipal() {

		
		String opcao1 = "1. Menu Gerente";
		String opcao2 = "2. Menu Coordenador";
		String opcao3 = "3. Menu Atendente";

		
//______CRIA O FRAME		
		JFrame frameMenuPrincipal = new JFrame();
		
		frameMenuPrincipal.setSize(200, 200); // Define tamanho do frame (altura x Largura)
		frameMenuPrincipal.setTitle("MENU PRINCIPAL"); // Inseri Título da tela
		
		
//______CRIA O PAINEL		
		JPanel panelMenuPrincipal = new JPanel(); // Criação do painel

		
//______CRIA O LABEL		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuPrincipal.add(labelOpcao1); // Adiciona o labelOpcao1 no panelMenuPrincipal
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelMenuPrincipal.add(labelOpcao2);
		
		JLabel labelOpcao3 = new JLabel(opcao3);
		panelMenuPrincipal.add(labelOpcao3);

		
//______CRIA O CAMPO DO TEXTO		
		JTextField textResposta = new JTextField(10);
		panelMenuPrincipal.add(textResposta); // adiciona textResposta no panelMenuPrincipal
		
		
//______CRIA O BOTÃO
		JButton botaoEnviar = new JButton("Enviar");
		panelMenuPrincipal.add(botaoEnviar); // Adiciona o botão no panelMenuPrincipal
		
		
//______ADICIONA O PANELMENUPRINCIPAL NO FRAMEMENUPRINCIPAL		
		frameMenuPrincipal.add(panelMenuPrincipal);
		frameMenuPrincipal.setVisible(true);// Torna o frameMenuPrincipal visivel
		
//______CRIA INSTANCIA DO CONSTRUTOR COM DOIS PARAMENTROS SETADOS_________________________________________________________		
		ControladorMenuPrincipal controladorMenuPrincipal = new ControladorMenuPrincipal(textResposta,frameMenuPrincipal);
		botaoEnviar.addActionListener(controladorMenuPrincipal);// Indicando qual é o action do botão
		
	}//FECHA METODO	
	

}//FECHA CLASSE
