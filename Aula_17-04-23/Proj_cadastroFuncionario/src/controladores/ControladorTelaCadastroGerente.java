package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entidades.Gerente;
import gerenciaArquivo.ManipulaArquivo;

public class ControladorTelaCadastroGerente implements ActionListener{
	
//______VARIÁVEIS DE INSTÂNCIAS DO TIPO JTEXTFIELD	
		JTextField textNomeGerenteRecebido;
		JTextField textCpfGerenteRecebido;
		JTextField textGerenciaGerenteRecebido;
		
//______CRIA INSTANCIA DO OBJETO MANIPULAARQUIVO 
		ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
		
		
		
//______CONSTRUTOR QUE RECEBE OS TRÊS JTEXTFILD, ARMAZENANDO COMO VARIAVEL			
		public ControladorTelaCadastroGerente (JTextField textNomeGerenteRecebido, JTextField textCpfGerenteRecebido, JTextField textGerenciaGerenteRecebido) {
		this.textNomeGerenteRecebido = textNomeGerenteRecebido;
		this.textCpfGerenteRecebido = textCpfGerenteRecebido;
		this.textGerenciaGerenteRecebido = textGerenciaGerenteRecebido;
}
		
		
//_____IMPLEMENTA MÉTODO "actionPerformed" DA INTERFACE "ActionListener"
//_____INVOCA MÉTODO "registrarCoordenador" DO OBJETO "manipulaArquivo" QUE TEM COMO PARÂMETRO O RESULTADO DO MÉTODO  "popularCoordenador". 
	   @Override
       public void actionPerformed(ActionEvent e) {
					
			manipulaArquivo.registrarGerente(popularGerente());
					
//__________LIMPA CAMPOS APÓS REGISTRO NO BUFFERED			
			textNomeGerenteRecebido.setText("");
			textCpfGerenteRecebido.setText("");
			textGerenciaGerenteRecebido.setText("");	
										
	  }
	   
	   
	   
//_____METÓDO "popularCoordenador" CRIA OBJETO "coordenador" QUE RETORNA COM SEUS ATRIBUTOS DEFINIDOS 		
       public Gerente popularGerente () {

    	   Gerente gerente = new Gerente();
			
    	   gerente.setNome(textNomeGerenteRecebido.getText());
    	   gerente.setCpf(textCpfGerenteRecebido.getText());
		   gerente.setGerencia(textGerenciaGerenteRecebido.getText());
			
			return gerente;
		}
		
}//FECHA CLASSE