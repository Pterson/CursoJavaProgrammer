package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorTelaCadastroGerente;

public class TelaCadastroGerente {

	
//______METODO RESPONSAVEL PELO CADASTRO DO COORDENADOR	
	public void telaCadastrarGerente() {
		
//______VARIÁVEIS DEFINIDAS COM MENSAGENS QUE SERÃO EXIBIDAS PARA O USUÁRIO	
		String nomeGerente = "Digite o nome do Gerente: ";
		String cpfGerente = "Digite o cpf do Gerente: ";
		String gerenciaGerente = "Qual tipo de gestão(Gerente): ";
		
		
//______CRIA O FRAME	
		JFrame frameCadastroGerente = new JFrame();
				
		frameCadastroGerente.setSize(330, 300);
		frameCadastroGerente.setTitle("Cadastro Gerente"); // Inseri Título da tela
		
		
		
//______CRIA O PAINEL			
		JPanel panelCadastroGerente = new JPanel();
				
				
//______CRIA O LABEL
		JLabel labelNomeGerente = new JLabel(nomeGerente);
		panelCadastroGerente.add(labelNomeGerente);		
				
//______CRIA O TEXTFIELD		
		JTextField textNomeGerente = new JTextField(10);
		panelCadastroGerente.add(textNomeGerente);
		
		
		JLabel labelCpfGerente = new JLabel(cpfGerente);
		panelCadastroGerente.add(labelCpfGerente);
		
		JTextField textCpfGerente = new JTextField(10);
		panelCadastroGerente.add(textCpfGerente);
		
		
		JLabel labelGerenciaGerente = new JLabel(gerenciaGerente);
		panelCadastroGerente.add(labelGerenciaGerente);
		
		JTextField textGerenciaGerente = new JTextField(10);
		panelCadastroGerente.add(textGerenciaGerente);
		
		
//______CRIA O BOTÃO		
		JButton botaoEnviar = new JButton("Enviar");
		panelCadastroGerente.add(botaoEnviar);
		
		
//______ADICIONA O PANELCADASTROCOORDENADOR NO FRAMECADASTROCOORDENADOR				
	    frameCadastroGerente.add(panelCadastroGerente);
	    frameCadastroGerente.setVisible(true);
		
		
	    ControladorTelaCadastroGerente telaCadastroGerente = new ControladorTelaCadastroGerente(textNomeGerente, textCpfGerente, textGerenciaGerente);  
		botaoEnviar.addActionListener(telaCadastroGerente);
	    
	}

}
