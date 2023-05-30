package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controladores.ControladorTelaLogin;


public class TelaLogin {
	
	public void iniciarTelaLogin() {
	
	String matricula = " MATRICULA";
	String senha = " SENHA";
	
	
//__________CRIA FRAME
			JFrame frameTelaLogin = new JFrame();
			frameTelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frameTelaLogin.setSize(300,300);
			frameTelaLogin.setTitle("Tela Login");
			

//__________CRIA PAINEL
			JPanel panelTelaLogin = new JPanel();
			GridLayout grid = new GridLayout(0,1);
			panelTelaLogin.setLayout(grid);
			
			JLabel labelMatricula = new JLabel(matricula);
			panelTelaLogin.add( labelMatricula);
			
			
//__________CRIA TEXTFIELD			
			JTextField textMatricula = new JTextField(10);
			panelTelaLogin.add(textMatricula);
			
			JLabel labelSenha = new JLabel(senha);
			panelTelaLogin.add(labelSenha);
			
			
			JPasswordField textSenha = new JPasswordField();
			panelTelaLogin.add(textSenha);
			
			JButton buttonLogin = new JButton("Login");
			panelTelaLogin.add(buttonLogin);
			
			frameTelaLogin.add(panelTelaLogin);
			frameTelaLogin.setVisible(true);
			
			ControladorTelaLogin controladorTelaLogin = new ControladorTelaLogin(textMatricula, textSenha, frameTelaLogin);
			buttonLogin.addActionListener(controladorTelaLogin);

    }
}
