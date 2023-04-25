package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorTelaCadastroCoordenador;

public class TelaCadastroCoordenador {
	
	
//______METODO RESPONSAVEL PELO CADASTRO DO COORDENADOR	
	public void telaCadastrarCoordenador() {

//______VARIÁVEIS DEFINIDAS COM MENSAGENS QUE SERÃO EXIBIDAS PARA O USUÁRIO	
		String nomeCoordenador = "Digite o nome do Coordenador: ";
		String cpfCoordenador = "Digite o cpf do Coordenador: ";
		String CoordenaCoordenador = "Qual tipo de coordenação(Coordenador): ";
		
		
//______CRIA O FRAME	
		JFrame frameCadastroCoordenador = new JFrame();
		
		frameCadastroCoordenador.setSize(330, 300);
		frameCadastroCoordenador.setTitle("Cadastro Coordenador"); // Inseri Título da tela
		
		
//______CRIA O PAINEL			
		JPanel panelCadastroCoordenador = new JPanel();
		
		
//______CRIA O LABEL
		JLabel labelNomeCoordenador = new JLabel(nomeCoordenador);
		panelCadastroCoordenador.add(labelNomeCoordenador);		
		
//______CRIA O TEXTFIELD		
		JTextField textNomeCoordenador = new JTextField(10);
		panelCadastroCoordenador.add(textNomeCoordenador);
		
		
		JLabel labelCpfCoordenador = new JLabel(cpfCoordenador);
		panelCadastroCoordenador.add(labelCpfCoordenador);
		
		JTextField textCpfCoordenador = new JTextField(10);
		panelCadastroCoordenador.add(textCpfCoordenador);
		
		
		JLabel labelCoordenaCoordenador = new JLabel(CoordenaCoordenador);
		panelCadastroCoordenador.add(labelCoordenaCoordenador);
		
		JTextField textCoordenaCoordenador = new JTextField(10);
		panelCadastroCoordenador.add(textCoordenaCoordenador);
		
		
//______CRIA O BOTÃO		
		JButton botaoEnviar = new JButton("Enviar");
		panelCadastroCoordenador.add(botaoEnviar);
		
		
//______ADICIONA O PANELCADASTROCOORDENADOR NO FRAMECADASTROCOORDENADOR				
	    frameCadastroCoordenador.add(panelCadastroCoordenador);
		frameCadastroCoordenador.setVisible(true);
		
		
		ControladorTelaCadastroCoordenador telaCadastroCoordenador = new ControladorTelaCadastroCoordenador(textNomeCoordenador, textCpfCoordenador, textCoordenaCoordenador);  
		botaoEnviar.addActionListener(telaCadastroCoordenador);
		
	}

}//FECHA CLASSE
