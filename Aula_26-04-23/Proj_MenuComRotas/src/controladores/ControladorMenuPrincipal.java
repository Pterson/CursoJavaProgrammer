package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorMenuPrincipal implements ActionListener{
	

//______________Declarando variáveis	
	
	JTextField textRespostaRecebida;
	JFrame frameRecebido;
	
//----------------------------------------------------------------------------------------	
	

//______________Construtor da Classe ControladorMenuPrincipal	
	
	public ControladorMenuPrincipal(JTextField textRespostaParametro, JFrame frameRecebidoParametro) {
		this.textRespostaRecebida = textRespostaParametro;
		this.frameRecebido = frameRecebidoParametro;	
	}
	
	
//----------------------------------------------------------------------------------------
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String opcao = textRespostaRecebida.getText();
		
		
		if (opcao.equals("1") || opcao.equals("2") || opcao.equals("3")) {
			switch (opcao) {

			case "1":

				System.out.println("Rota X");
				break;

			case "2":

				System.out.println("Rota Y");
				break;

			case "3":

				System.out.println("Rota Z");
				break;			

			}
		} else
			
			JOptionPane.showMessageDialog(null, "Está Rota Não Existe!!!");

	}


}
