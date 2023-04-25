package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorTelaCadastroAtendente;


public class TelaCadastroAtendente {
	
	public void telaCadastrarAtendente() {
		
//______VARIÁVEIS DEFINIDAS COM MENSAGENS QUE SERÃO EXIBIDAS PARA O USUÁRIO	
		String nomeAtendente = "Digite o nome do Atendente: ";
		String cpfAtendente = "Digite o cpf do Atendente: ";
		String setorAtendente = "Qual é o setor do Atendente: ";
		
		
//______CRIA O FRAME	
		JFrame frameCadastroAtendente = new JFrame();
				
		frameCadastroAtendente.setSize(330, 300);
		frameCadastroAtendente.setTitle("Cadastro Atendente"); // Inseri Título da tela
		
		
//______CRIA O PAINEL			
		JPanel panelCadastroAtendente = new JPanel();
				
				
//______CRIA O LABEL
		JLabel labelNomeAtendente = new JLabel(nomeAtendente);
		panelCadastroAtendente.add(labelNomeAtendente);		
				
//______CRIA O TEXTFIELD		
		JTextField textNomeAtendente = new JTextField(10);
		panelCadastroAtendente.add(textNomeAtendente);
				
				
		JLabel labelCpfAtendente = new JLabel(cpfAtendente);
		panelCadastroAtendente.add(labelCpfAtendente);
				
		JTextField textCpfAtendente = new JTextField(10);
		panelCadastroAtendente.add(textCpfAtendente);
				
				
		JLabel labelSetorAtendente = new JLabel(setorAtendente);
		panelCadastroAtendente.add(labelSetorAtendente);
				
		JTextField textSetorAtendente = new JTextField(10);
		panelCadastroAtendente.add(textSetorAtendente);

		
		
//______CRIA O BOTÃO		
		JButton botaoEnviar = new JButton("Enviar");
		panelCadastroAtendente.add(botaoEnviar);
		
		
		
//______ADICIONA O PANELCADASTROATENDENTE NO FRAMECADASTROATENDENTE				
        frameCadastroAtendente.add(panelCadastroAtendente);
		frameCadastroAtendente.setVisible(true);
		

		
//______CRIA INSTANCIA DA ControladorTelaCadastroAtendente com os parametros e atribua a variavel telaCadastroAtendente
		ControladorTelaCadastroAtendente telaCadastroAtendente = new ControladorTelaCadastroAtendente(textNomeAtendente, textCpfAtendente, textSetorAtendente);  
//______IMPLEMENTA A CLASSE A INTERFACE ACTIONLISTENER 
		botaoEnviar.addActionListener(telaCadastroAtendente);		
		
		
	}

}
