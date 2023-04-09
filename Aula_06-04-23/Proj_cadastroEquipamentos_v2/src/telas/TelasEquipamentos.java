package telas;

import javax.swing.JOptionPane;

import entidade.Equipamento;
import entidade.Furadeira;
import entidade.Makita;
import servicos.CalculaLucro;

public class TelasEquipamentos {
	


/*====================================================_____FURADEIRAS_____===============================================================*/
	
//======BLOCO INSERÇÃO DE DADOS NO CADASTRO FURADEIRA (SET)_____________________________________________________________________________________
	public Furadeira cadastrarFuradeira(Furadeira cadFuradeira) {	
		
		cadFuradeira.setMarca(JOptionPane.showInputDialog("Digite a marca da Furadeira: "));
		cadFuradeira.setCodigo(JOptionPane.showInputDialog("Digite o código para Furadeira: "));
		cadFuradeira.setValorDaCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de compra da furadeira:")));
		cadFuradeira.setValorDaVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de venda da furadeira:")));
		
		return cadFuradeira;
	}
	
//======BLOCO EXIBE INFORMAÇÕES CADASTRADAS FURADEIRA (GET)_____________________________________________________________________________________
	public Furadeira exibeFuradeira(Furadeira exibeFuradeira) {
		
//		CalculaLucro calculalucro = new CalculaLucro();
//		double lucro = calculalucro.CalculaLucro(exibeFuradeira.getValorDaCompra(), exibeFuradeira.getValorDaVenda());
		
		JOptionPane.showMessageDialog(null,"A marca cadastrada para Furadeira foi: " + exibeFuradeira.getMarca());
		JOptionPane.showMessageDialog(null,"O código cadastrado para Furadeira foi: " + exibeFuradeira.getCodigo());
		JOptionPane.showMessageDialog(null,"O valor de compra da Furadeira foi: " +exibeFuradeira.getValorDaCompra());
		JOptionPane.showMessageDialog(null,"O valor de venda da Furadeira foi: " + exibeFuradeira.getValorDaVenda());	
		
		return exibeFuradeira;
	}
	
//======BLOCO EXIBE VALOR DO LUCRO FURADEIRA____________________________________________________________________________________________________
	double lucroLiquido; {	
	
	double lucroLiquido = calculalucro.CalculaLucro(exibeFuradeira.getValorDaCompra(), exibeFuradeira.getValorDaVenda()); 
	
	JOptionPane.showMessageDialog(null,"O lucro obtido na furadeira: " + lucroLiquido);
	
	}	

/*=======================================================_____MAKITAS_____===============================================================*/	
	
//======BLOCO INSERÇÃO DE DADOS NO CADASTRO MAKITA (SET)_______________________________________________________________________________________	
	public Makita cadastrarMakita(Makita cadMakita) {
		
		cadMakita.setMarca(JOptionPane.showInputDialog("Digite a marca da Makita: "));
		cadMakita.setCodigo(JOptionPane.showInputDialog("Digite código para Makita foi: "));
		cadMakita.setValorDaCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de compra da Makita:")));
		cadMakita.setValorDaVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de venda da Makita:")));
		
		return cadMakita;
	}
	
//======BLOCO EXIBE INFORMAÇÕES CADASTRADAS FURADEIRA (GET)_____________________________________________________________________________________
	public Makita exibeMakita(Makita exibeMakita) {
		
		JOptionPane.showMessageDialog(null,"A marca cadastrada para Makita foi: " + exibeMakita.getMarca());
		JOptionPane.showMessageDialog(null,"O código cadastrado para Makita foi: " + exibeMakita.getCodigo());
		JOptionPane.showMessageDialog(null,"O valor de compra da Makita foi: "  + exibeMakita.getValorDaCompra());
		JOptionPane.showMessageDialog(null,"O valor de venda da Makita foi: "  + exibeMakita.getValorDaVenda());
		
		return exibeMakita;
	}
	
//======BLOCO EXIBE VALOR DO LUCRO MAKITA_______________________________________________________________________________________________________	
	double lucroLiquido; {	
	
	double lucroLiquido = calculalucro.CalculaLucro(exibeMakita.getValorDaCompra(), exibeMakita.getValorDaVenda()); 
	
	JOptionPane.showMessageDialog(null,"O lucro obtido na Makita: " + lucroLiquido);
		
	}
}	

