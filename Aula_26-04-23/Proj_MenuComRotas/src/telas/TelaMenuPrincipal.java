package telas;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorMenuPrincipal;

public class TelaMenuPrincipal {
		
		public void menuPrincipal() {
			
			String rota1 = "Digite 1 => Rota X";
			String rota2 = "Digite 2 => Rota Y";
			String rota3 = "Digite 3 => Rota Z";
			
			
			GridLayout telaLayout = new GridLayout(0,1); //criando o //criando o GridLayout
			JFrame frameMenuPrincipal = new JFrame(); //criando o frame
			
			frameMenuPrincipal.setSize(280, 280); // Definindo tamanho do frame (altura x Largura)
			frameMenuPrincipal.setTitle("MENU ROTAS"); // Inserindo Título da tela
			
//----------------------------------------------------------------------------------------		

			JPanel panelMenuPrincipal = new JPanel(); //criando o painel
			panelMenuPrincipal.setLayout(telaLayout);
//----------------------------------------------------------------------------------------		

			JLabel labelRota1 = new JLabel(rota1); // criando label
			panelMenuPrincipal.add(labelRota1); // add label no panel
			
			JLabel labelRota2 = new JLabel(rota2);
			panelMenuPrincipal.add(labelRota2);
			
			JLabel labelRota3 = new JLabel(rota3);
			panelMenuPrincipal.add(labelRota3);
		
//----------------------------------------------------------------------------------------	
			
			JTextField textResposta = new JTextField(10); //Criando campo textField
			panelMenuPrincipal.add(textResposta);
//----------------------------------------------------------------------------------------		
			
			JButton botaoEnviar = new JButton("Enviar"); //Criando botão
			panelMenuPrincipal.add(botaoEnviar);			
//----------------------------------------------------------------------------------------					
			
			frameMenuPrincipal.add(panelMenuPrincipal); // add o panel no frame
			frameMenuPrincipal.setVisible(true);// Tornando o frameMenuPrincipal visivel
			
//----------------------------------------------------------------------------------------	
			
			ControladorMenuPrincipal controladorMenuPrincipal = new ControladorMenuPrincipal(textResposta, frameMenuPrincipal);
			botaoEnviar.addActionListener(controladorMenuPrincipal);

			
//----------------------------------------------------------------------------------------		
			
			
//----------------------------------------------------------------------------------------		
		}
	
}//Fecha Classe
