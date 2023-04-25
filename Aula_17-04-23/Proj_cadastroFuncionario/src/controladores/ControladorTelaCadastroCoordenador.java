package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JTextField;

import entidades.Coordenador;
import gerenciaArquivo.ManipulaArquivo;

public class ControladorTelaCadastroCoordenador implements ActionListener{
	
//______VARIÁVEIS DE INSTÂNCIAS DO TIPO JTEXTFIELD	
		JTextField textNomeCoordenadorRecebido;
		JTextField textCpfCoordenadorRecebido;
		JTextField textCoordenaCoordenadorRecebido;
		
//______CRIA INSTANCIA DO OBJETO MANIPULAARQUIVO 
		ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
		
		
//______CONSTRUTOR QUE RECEBE OS TRÊS JTEXTFILD, ARMAZENANDO COMO VARIAVEL			
		public ControladorTelaCadastroCoordenador(JTextField textNomeCoordenadorRecebido, JTextField textCpfCoordenadorRecebido, JTextField textCoordenaCoordenadorRecebido) {
			this.textNomeCoordenadorRecebido = textNomeCoordenadorRecebido;
			this.textCpfCoordenadorRecebido = textCpfCoordenadorRecebido;
			this.textCoordenaCoordenadorRecebido = textCoordenaCoordenadorRecebido;
		}
		
//_____IMPLEMENTA MÉTODO "actionPerformed" DA INTERFACE "ActionListener"
//_____INVOCA MÉTODO "registrarCoordenador" DO OBJETO "manipulaArquivo" QUE TEM COMO PARÂMETRO O RESULTADO DO MÉTODO  "popularCoordenador". 
		@Override
		public void actionPerformed(ActionEvent e) {
			
			manipulaArquivo.registrarCoordenador(popularCoordenador());
			
//__________LIMPA CAMPOS APÓS REGISTRO NO BUFFERED			
			textNomeCoordenadorRecebido.setText("");
			textCpfCoordenadorRecebido.setText("");
			textCoordenaCoordenadorRecebido.setText("");
								
		}
		
		
//_____METÓDO "popularCoordenador" CRIA OBJETO "coordenador" QUE RETORNA COM SEUS ATRIBUTOS DEFINIDOS 		
       public Coordenador popularCoordenador() {

			Coordenador coordenador = new Coordenador();
			
			coordenador.setNome(textNomeCoordenadorRecebido.getText());
			coordenador.setCpf(textCpfCoordenadorRecebido.getText());
			coordenador.setCoordena(textCoordenaCoordenadorRecebido.getText());
			
			return coordenador;
		}		
		
}//FECHA CLASSE
