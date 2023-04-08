package principal;

import javax.swing.JOptionPane;

import entidades.Furadeiras;
import entidades.Makitas;

public class Principal {
	
	public static void main(String[] args) {

// INICIANDO OBJETOS
		Furadeiras furadeiras = new Furadeiras();
		Makitas makitas = new Makitas();
		
		String recebeCodigoTemp = null;
		String recebeMarcaTemp;
		String recebeValorDaCompraTemp;
		String retornaLucroTemp = null;

//======BLOCO CÓDIGO_____________________________________________________		
		recebeMarcaTemp = JOptionPane.showInputDialog("Digite a código:");
		
		JOptionPane.showMessageDialog(null,"O código cadastrada foi: " + recebeCodigoTemp);

//======BLOCO MARCA_____________________________________________________
		recebeMarcaTemp = JOptionPane.showInputDialog("Digite a marca:");
		
		JOptionPane.showMessageDialog(null,"A marca cadastrada foi: " + recebeMarcaTemp);
		
//======BLOCO VALOR_______________________________________________________________________________
		recebeValorDaCompraTemp = JOptionPane.showInputDialog("Digite valor de compra do produto:");
				
		JOptionPane.showMessageDialog(null,"O valor pago pelo produto foi: " + recebeValorDaCompraTemp);
		
//======BLOCO LUCRO_____________________________________________________
						
		JOptionPane.showMessageDialog(null,"O lucro pelo produto foi: " + retornaLucroTemp);
}}
