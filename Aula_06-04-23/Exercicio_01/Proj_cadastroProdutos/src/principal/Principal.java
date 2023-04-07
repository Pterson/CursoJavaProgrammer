package principal;

import javax.swing.JOptionPane;

import entidades.Celular;
import entidades.Televisao;

public class Principal {

	public static void main(String[] args) {
		
		Celular celular = new Celular();
		Televisao televisao = new Televisao();
		
		
		
//		String recebeCodigo;
//		String recebeModelo;
		String recebeModeloTemp;
		
		recebeModeloTemp = JOptionPane.showInputDialog("Qual modelo do disposito?");
		
		JOptionPane.showMessageDialog(null,"O nome recebido foi: " + recebeModeloTemp);
		

	}

}
