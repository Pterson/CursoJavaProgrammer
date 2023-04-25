package telas;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class InterfaceUsuario{

	public void popUser () {
		
		String nome = "Digite seu nome: ";
		String cpf = "Digite seu cpf: ";
		String time = "Digite seu time: ";
		
		
//======CRIAÇÃO DA INSTÂNCIA FRAMEMENU_____________________________	
		JFrame frameMenu = new JFrame();
		
//======CRIAÇÃO DO JFRAME (Pop-Up)__________________________________	
		frameMenu.setTitle("CADASTRO TORCEDOR");		
		frameMenu.setSize(300,400);
		

//__________________________________________________________________________________________________________		
		
		
		
//======CRIAÇÃO JLABEL DENTRO DO FRAME (Pop-Up)__________________________________	


		JPanel panelMenu = new JPanel(new GridLayout(3, 2));		
        JTextField panelTexto = new JTextField(5); 
        JButton panelBotao = new JButton("Salvar");     
          
        
        
        JLabel jlNome = new JLabel(nome);        
        panelMenu.add(jlNome); 
        
        panelMenu.add(new JTextField(5));
        
        JLabel jlCpf = new JLabel(cpf);
        panelMenu.add(jlCpf);
        panelMenu.add(new JTextField(5));          
       
        JLabel jlTime = new JLabel(time);
        panelMenu.add(jlTime);
        panelMenu.add(new JTextField(5));

		
//======ADICIONANDO CAIXA DE TEXTO NO FRAME_____________________________________			
	//	frameMenu.add(panelMenu);
		frameMenu.add(panelTexto);
	//	frameMenu.add(panelBotao);
		frameMenu.add(panelMenu, BorderLayout.CENTER);
	    frameMenu.add(panelBotao, BorderLayout.SOUTH);
//======TORNA O FRAME VISÍVELE_____________________________________		
		frameMenu.setVisible(true);
		
		
		
		
				
		
		
		
		
		
	
		
	}

}
