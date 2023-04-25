package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entidades.Atendente;
import gerenciaArquivo.ManipulaArquivo;

public class ControladorTelaCadastroAtendente implements ActionListener{
	
	
//______VARIÁVEIS DE INSTÂNCIAS DO TIPO JTEXTFIELD	
		JTextField textNomeAtendenteRecebido;
		JTextField textCpfAtendenteRecebido;
		JTextField textSetorAtendenteRecebido;
			
//______CRIA INSTANCIA DO OBJETO MANIPULAARQUIVO 
		ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
		
		
		
//______CONSTRUTOR QUE RECEBE OS TRÊS JTEXTFILD, ARMAZENANDO COMO VARIAVEL			
		public ControladorTelaCadastroAtendente(JTextField textNomeAtendenteRecebido, JTextField textCpfAtendenteRecebido, JTextField textSetorAtendenteRecebido) {
		this.textNomeAtendenteRecebido = textNomeAtendenteRecebido;
		this.textCpfAtendenteRecebido = textCpfAtendenteRecebido;
		this.textSetorAtendenteRecebido = textSetorAtendenteRecebido;

}
		
		
//_____IMPLEMENTA MÉTODO "actionPerformed" DA INTERFACE "ActionListener"
//_____INVOCA MÉTODO "registrarAtendente" DO OBJETO "manipulaArquivo" QUE TEM COMO PARÂMETRO O RESULTADO DO MÉTODO  "popularAtendente". 
    	@Override
			public void actionPerformed(ActionEvent e) {
					
				manipulaArquivo.registrarAtendente (popularAtendente());
					
//__________LIMPA CAMPOS APÓS REGISTRO NO BUFFERED			
				textNomeAtendenteRecebido.setText("");
				textCpfAtendenteRecebido.setText("");
				textSetorAtendenteRecebido.setText("");
										
				}
    	
  
//_____METÓDO "popularAtendente" CRIA OBJETO "atendente" QUE RETORNA COM SEUS ATRIBUTOS DEFINIDOS 		
        public Atendente popularAtendente () {

 			Atendente atendente = new Atendente();
 			
 			atendente.setNome(textNomeAtendenteRecebido.getText());
 			atendente.setCpf(textCpfAtendenteRecebido.getText());
 			atendente.setSetor(textSetorAtendenteRecebido.getText());
 			
 			return atendente;
 		}		
 		
 }//FECHA CLASSE

