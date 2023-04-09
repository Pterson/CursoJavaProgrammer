package telas;

import javax.swing.JOptionPane;

import entidade.Furadeira;
import servicos.CalculaLucro;

public class TelasEquipamentos {
	
	CalculaLucro calculalucro = new CalculaLucro();

//======BLOCO EXIBE INFORMAÇÕES PARA CADASTRO_____________________________________________________________________________________
	public Furadeira cadastrarFuradeira(Furadeira equipaFuradeira) {
		equipaFuradeira.setMarca(JOptionPane.showInputDialog("Digite a marca da Furadeira: "));
		equipaFuradeira.setCodigo(JOptionPane.showInputDialog("Digite o código da Furadeira: "));
		equipaFuradeira.setValorDaCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de compra da furadeira:")));
		equipaFuradeira.setValorDaVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de venda da furadeira:")));
		
		return equipaFuradeira;
	}
	
//======BLOCO EXIBE INFORMAÇÕES PARA CADASTRO_____________________________________________________________________________________
	public void exibeFuradeira(Furadeira equipaFuradeira) {
		JOptionPane.showMessageDialog(null,"A marca da furadeira cadastrada foi: " + equipaFuradeira.getMarca());
		JOptionPane.showMessageDialog(null,"O código cadastrada foi: " + equipaFuradeira.getCodigo());
		JOptionPane.showMessageDialog(null,"O valor pago na furadeira: " + equipaFuradeira.getValorDaCompra());
		JOptionPane.showMessageDialog(null,"O de venda da furadeira: " + equipaFuradeira.getValorDaVenda());	
		
	}
	
//======BLOCO EXIBE VALOR DO LUCRO________________________________________________________________________________________________
	double lucroLiquido;
	
	lucroLiquido = calculalucro.CalculaLucro(valorDaCompra, valorDaVenda);
	
	JOptionPane.showMessageDialog(null,"O lucro obtido na furadeira: " + lucroLiquido);
}

	}
