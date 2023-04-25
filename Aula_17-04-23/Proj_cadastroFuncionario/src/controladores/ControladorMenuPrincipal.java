package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import telas.TelaCadastroAtendente;
import telas.TelaCadastroCoordenador;
import telas.TelaCadastroGerente;
import telas.TelaMenuAtendente;
import telas.TelaMenuCoordenador;

public class ControladorMenuPrincipal implements ActionListener{
	

//______Declarando variáveis	
	JTextField textRespostaRecebida;
	JFrame frameRecebido;
	
	
//_____CRIA INSTANCIA Gerente
	TelaCadastroGerente telaCadastroGerente = new TelaCadastroGerente();
	//TelaMenuGerente telaMenuGerente = new TelaMenuGerente();
	
//_____CRIA INSTANCIA Coordenador	
	TelaCadastroCoordenador telaCadastroCoordenador = new TelaCadastroCoordenador();
	TelaMenuCoordenador telaMenuCoordenador= new TelaMenuCoordenador();
	

//_____CRIA INSTANCIA Atendente
	TelaCadastroAtendente telaCadastroAtendente = new TelaCadastroAtendente();
	TelaMenuAtendente telaMenuAtendente = new TelaMenuAtendente();

//_____CONSTRUTOR DA CLASSE ControladorMenuPrincipal	
	public ControladorMenuPrincipal(JTextField textRespostaParametro, JFrame frameRecebido) {
		this.textRespostaRecebida = textRespostaParametro;
		this.frameRecebido = frameRecebido;		
	}

	
//_____IMPLEMENTAÇÃO DO METODO EM CONJUNTO COM A ACTIONLISTENER 	
	@Override
	public void actionPerformed(ActionEvent e) {
		String opcao = textRespostaRecebida.getText();

	if (opcao.equals("1") || opcao.equals("2") || opcao.equals("3")) {
			switch (opcao) {
			
			case "1":

				telaCadastroGerente.telaCadastrarGerente(); // TEM QUE IR AO MENU ANTES DE IR AO CADASTRO.
				frameRecebido.setVisible(false);
				break;
				
			case "2":
				//System.out.println("Abrir Visualizar");
			//	telaCadastroCoordenador.telaCadastrarCoordenador();
				telaMenuCoordenador.menuCoordenador();
				frameRecebido.setVisible(false);	
				break;
				
			case "3":
				//System.out.println("Abrir Visualizar");
				//telaCadastroAtendente.telaCadastrarAtendente();
				telaMenuAtendente.menuAtendente();				
				frameRecebido.setVisible(false);	
				break;
			
			default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");

		   }
       } 

	}
	
}
