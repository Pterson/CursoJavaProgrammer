package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorTelaMenuPrincipal;

public class TelaMenuPrincipal {
	
	public void menuPrincipal() {
		
		
		String opcao1 = "1. Para Cadastrar";
		String opcao2 = "2. Para Listar";
		String opcao3 = "3. Para Deletar";
		String opcao4 = "4. Para Atualizar";
		
		
		JFrame frameTelaMenuPrincipal = new JFrame();		
		frameTelaMenuPrincipal.setSize(400, 250);
		frameTelaMenuPrincipal.setTitle("Menu Principal");
		frameTelaMenuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panelTelaMenuPrincipal = new JPanel();
		

		GridLayout grid = new GridLayout (0,1);
		panelTelaMenuPrincipal.setLayout(grid);
		
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelTelaMenuPrincipal.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelTelaMenuPrincipal.add(labelOpcao2);
		
		JLabel labelOpcao3 = new JLabel(opcao3);
		panelTelaMenuPrincipal.add(labelOpcao3);
		
		JLabel labelOpcao4 = new JLabel(opcao4);
		panelTelaMenuPrincipal.add(labelOpcao4);
		

		JTextField textRespostaTelaMenuPrincipal = new JTextField(10);
		panelTelaMenuPrincipal.add(textRespostaTelaMenuPrincipal);
		
		
		JButton buttonEnviarTelaMenuPrincipal = new JButton("Enviar");
		panelTelaMenuPrincipal.add(buttonEnviarTelaMenuPrincipal);
		
		
		frameTelaMenuPrincipal.add(panelTelaMenuPrincipal);
		frameTelaMenuPrincipal.setVisible(true);
		
		ControladorTelaMenuPrincipal controladorTelaMenuPrincipal = new ControladorTelaMenuPrincipal(frameTelaMenuPrincipal, textRespostaTelaMenuPrincipal);
		buttonEnviarTelaMenuPrincipal.addActionListener(controladorTelaMenuPrincipal);
	}

}
