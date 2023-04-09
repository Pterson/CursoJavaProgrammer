package telas;

import javax.swing.JOptionPane;

import entidades.Furadeiras;
import servicos.calcSalarioObtido;

public class TelasEquipamentos {
	
	public void ApresentaRecebeFuradeiras(Furadeiras furadeiras) {
		calcSalarioObtido calcsalarioobtido = new calcSalarioObtido();
		
		//======BLOCO RECEBE/EXIBE CÓDIGO________________________________________________________________________		

				furadeiras.setCodigo(JOptionPane.showInputDialog("Digite o código da furadeira:"));
				JOptionPane.showMessageDialog(null,"O código cadastrada foi: " + furadeiras.getCodigo());

		//======BLOCO RECEBE/EXIBE MARCA_________________________________________________________________________
				 
				furadeiras.setMarca(JOptionPane.showInputDialog("Digite a marca da furadeira:"));
				JOptionPane.showMessageDialog(null,"A marca da furadeira cadastrada foi: " + furadeiras.getMarca());
				
		//======BLOCO RECEBE/EXIBE VALOR_________________________________________________________________________
			
				furadeiras.setValorDaCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de compra da furadeira:")));		
				JOptionPane.showMessageDialog(null,"O valor pago na furadeira: " + furadeiras.getValorDaCompra());
				
		//======BLOCO RECEBE/EXIBE VALOR VENDA___________________________________________________________________		
				
				furadeiras.setValorDaVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de venda da furadeira:")));
				JOptionPane.showMessageDialog(null,"O de venda da furadeira: " + furadeiras.getValorDaVenda());	
				
		//======BLOCO CALCULA/EXIBE LUCRO________________________________________________________________________
				double salarioObtido;
				
				salarioObtido = calcsalarioobtido.calcSalarioObtido(furadeiras.getValorDaCompra(), furadeiras.getValorDaVenda());
				
				JOptionPane.showMessageDialog(null,"O lucro obtido da furadeira: " + salarioObtido);

		
	}

}
