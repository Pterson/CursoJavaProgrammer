package gui;

import entidades.ConvidadoVip;
import javax.swing.JOptionPane;
import arquivos.DadosRegistrados;
import entidades.ConvidadoSimples;



public class GuiConvidados {
	
//======INICIA OBJETO MENU (INSTANCIA DO OBJETOS A PARTIR DAS CLASSES)____________________________________________________________________________
	ConvidadoVip cadConvidadoV = new ConvidadoVip();
	ConvidadoSimples cadConvidadoS = new ConvidadoSimples();
//___________________________________________________________FINALIZANO BLOCO_____________________________________________________________________	

	
	
//====================================================_____MENU CONVIDADOS_____====================================================================	
	public void menu() {
	
	String opcao = null;
	Boolean repeticao = true;
	
	DadosRegistrados dadosregistrados = new DadosRegistrados();
	
	do {
		
        opcao = (JOptionPane.showInputDialog("1. VIP  -  2. SIMPLES  -  3. Encerrar"));
	
        switch (opcao) {
			case "1": 
				//exibeConvidadoVip(cadastrarConvidadoVip(cadConvidadoV));				
				//dadosregistrados.RegistrarConvVipBU(cadastrarConvidadoVip());	
				
				cadConvidadoV = cadastrarConvidadoVip();
				dadosregistrados.RegistrarConvVipBU(cadConvidadoV);
				exibeConvidadoVip(cadConvidadoV);
				
				break;
			
			case "2":	
				//exibeConvidadoSimples(cadastrarConvidadoSimples(cadConvidadoS));				
				//dadosregistrados.RegistrarConvSimplesBU(cadastrarConvidadoSimples());
				
				cadConvidadoS = cadastrarConvidadoSimples();
				dadosregistrados.RegistrarConvSimplesBU(cadConvidadoS);
				exibeConvidadoSimples(cadConvidadoS);
				
              break;
				
			case "3": 
				JOptionPane.showMessageDialog(null, "Encerrando...");
                System.exit(0); // Encerra o programa
				repeticao = false;
				break;
				
			default:
				  JOptionPane.showMessageDialog(null, "OPS, tente novamente!!!");				
	
        		}
        
	}while (repeticao);
			
	}	
//___________________________________________________________FINALIZANO BLOCO_______________________________________________________________________			
	
	
	
	
	
//======BLOCO INSERÇÃO DE DADOS NO CADASTRO CONVIDADO VIP (SET)=====================================================================================

	public ConvidadoVip cadastrarConvidadoVip () {
		
		ConvidadoVip cadConvidadoV = new ConvidadoVip();
		
		cadConvidadoV.setNome(JOptionPane.showInputDialog("Digite o nome do VIP: "));
		cadConvidadoV.setCpf(JOptionPane.showInputDialog("Digite o CPF do VIP: "));
		cadConvidadoV.setTipoVip(JOptionPane.showInputDialog("Digite se é VIP ou Normal: "));
		
		return cadConvidadoV;
	}
//___________________________________________________________FINALIZANO BLOCO________________________________________________________________________

	
	
	
	
//======BLOCO EXIBE INFORMAÇÕES CADASTRADAS CONVIDADO VIP (GET)======================================================================================	

	public ConvidadoVip exibeConvidadoVip (ConvidadoVip exibeConvidadoVip) {
		
		JOptionPane.showMessageDialog(null,"O nome do VIP cadastrado foi: " + exibeConvidadoVip.getNome());
		JOptionPane.showMessageDialog(null,"O CPF do VIP cadastrado foi: " + exibeConvidadoVip.getCpf());
		JOptionPane.showMessageDialog(null,"O Convite cadastrado é do tipo: " + exibeConvidadoVip.getTipoVip());
		
		return exibeConvidadoVip;
	}
//___________________________________________________________FINALIZANO BLOCO________________________________________________________________________





//======BLOCO INSERÇÃO DE DADOS NO CADASTRO CONVIDADO VIP (SET)=====================================================================================

	public ConvidadoSimples cadastrarConvidadoSimples () {
		
		ConvidadoSimples cadConvidadoS = new ConvidadoSimples();
		
		cadConvidadoS.setNome(JOptionPane.showInputDialog("Digite o nome do SIMPLES: "));
		cadConvidadoS.setCpf(JOptionPane.showInputDialog("Digite o CPF do SIMPLES: "));
		cadConvidadoS.setTipoNormal(JOptionPane.showInputDialog("Digite se é VIP ou Normal: "));
		
		return cadConvidadoS;
	}
//___________________________________________________________FINALIZANO BLOCO________________________________________________________________________

	
	
	
	
//======BLOCO EXIBE INFORMAÇÕES CADASTRADAS CONVIDADO SIMPLES (GET)======================================================================================	

		public ConvidadoSimples exibeConvidadoSimples (ConvidadoSimples exibeConvidadoSimples) {
			
			JOptionPane.showMessageDialog(null,"O nome do SIMPLES cadastrado foi: " + exibeConvidadoSimples.getNome());
			JOptionPane.showMessageDialog(null,"O CPF do SIMPLES cadastrado foi: " + exibeConvidadoSimples.getCpf());
			JOptionPane.showMessageDialog(null,"O Convite cadastrado é do tipo: " + exibeConvidadoSimples.getTipoNormal());
			
			return exibeConvidadoSimples;
	}
//___________________________________________________________FINALIZANO BLOCO________________________________________________________________________

		
}// NÃO EXCLUIR 
