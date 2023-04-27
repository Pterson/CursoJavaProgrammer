package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorCadastroCoordenador;

public class TelaCadastroCoordenador {
	
	public void criarTelaCadastrarCoordenador() {
		
		String nomeCoordenador = "Digite o nome do Coordenador: ";
		String cpfCoordenador = "Digite o cpd do Coordenador";
		String coordenaCoordenador = "Digite qual tipo de coordenação: ";
		
		JFrame frameCadastroCoordenador = new JFrame();// cria o frame
		frameCadastroCoordenador.setSize(330,300); // define o tamanho do frame
		
		JPanel panelCadastroCoordenador = new JPanel(); // cria o painel
		
		JLabel labelNomeCoordenador = new JLabel(nomeCoordenador); // cria o label
		panelCadastroCoordenador.add(labelNomeCoordenador); // adiciona o label no painel
		
		JTextField textNomeCoordenador = new JTextField(10); // cria o campo de texto
		panelCadastroCoordenador.add(textNomeCoordenador); // adiciona o campo texto no painel
		
		JLabel labelCpfCoordenador = new JLabel(cpfCoordenador);
		panelCadastroCoordenador.add(labelCpfCoordenador);
		
		JTextField textCpfCoordenador = new JTextField(10);
		panelCadastroCoordenador.add(textCpfCoordenador);
		
		JLabel labelCoordenaCoordenador = new JLabel(coordenaCoordenador);
		panelCadastroCoordenador.add(labelCoordenaCoordenador);
		
		JTextField textCoordenador = new JTextField(10);
		panelCadastroCoordenador.add(textCoordenador);
		
		JButton botaoEnviar = new JButton("Enviar"); // cria botão
		panelCadastroCoordenador.add(botaoEnviar); // Adiciona botão no painel
		
		
		frameCadastroCoordenador.add(panelCadastroCoordenador);
		frameCadastroCoordenador.setVisible(true);
		
		
		ControladorCadastroCoordenador cadastroCoordenador = new ControladorCadastroCoordenador(textNomeCoordenador, textCpfCoordenador, textCoordenador);
		botaoEnviar.addActionListener(cadastroCoordenador);
		
		
	}

}//Fecha Classe
