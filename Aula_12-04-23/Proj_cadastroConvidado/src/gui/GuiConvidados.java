package gui;

import entidades.ConvidadoVip;

import javax.swing.JOptionPane;

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
	
	do {
		
        opcao = (JOptionPane.showInputDialog("1. VIP  -  2. SIMPLES  -  3. Encerrar"));
	
        switch (opcao) {
			case "1": 
				exibeConvidadoVip(cadastrarConvidadoVip(cadConvidadoV));
				break;
			
			case "2":	
				exibeConvidadoSimples(cadastrarConvidadoSimples(cadConvidadoS));
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

	public ConvidadoVip cadastrarConvidadoVip (ConvidadoVip cadConvidadoV) {
		
		cadConvidadoV.setNome(JOptionPane.showInputDialog("Digite o nome do VIP: "));
		cadConvidadoV.setCpf(JOptionPane.showInputDialog("Digite o CPF do VIP: "));
		
		return cadConvidadoV;
	}
//___________________________________________________________FINALIZANO BLOCO________________________________________________________________________

	
	
	
	
//======BLOCO EXIBE INFORMAÇÕES CADASTRADAS CONVIDADO VIP (GET)======================================================================================	

	public ConvidadoVip exibeConvidadoVip (ConvidadoVip exibeConvidadoVip) {
		
		JOptionPane.showMessageDialog(null,"O nome do VIP cadastrado foi: " + exibeConvidadoVip.getNome());
		JOptionPane.showMessageDialog(null,"O CPF do VIP cadastrado foi: " + exibeConvidadoVip.getCpf());
		
		return exibeConvidadoVip;
	}
//___________________________________________________________FINALIZANO BLOCO________________________________________________________________________





//======BLOCO INSERÇÃO DE DADOS NO CADASTRO CONVIDADO VIP (SET)=====================================================================================

	public ConvidadoSimples cadastrarConvidadoSimples (ConvidadoSimples cadConvidadoS) {
		
		cadConvidadoS.setNome(JOptionPane.showInputDialog("Digite o nome do SIMPLES: "));
		cadConvidadoS.setCpf(JOptionPane.showInputDialog("Digite o CPF do SIMPLES: "));
		
		return cadConvidadoS;
	}
//___________________________________________________________FINALIZANO BLOCO________________________________________________________________________

	
	
	
	
//======BLOCO EXIBE INFORMAÇÕES CADASTRADAS CONVIDADO SIMPLES (GET)======================================================================================	

		public ConvidadoSimples exibeConvidadoSimples (ConvidadoSimples exibeConvidadoSimples) {
			
			JOptionPane.showMessageDialog(null,"O nome do SIMPLES cadastrado foi: " + exibeConvidadoSimples.getNome());
			JOptionPane.showMessageDialog(null,"O CPF do SIMPLES cadastrado foi: " + exibeConvidadoSimples.getNome());
			
			return exibeConvidadoSimples;
		}
//___________________________________________________________FINALIZANO BLOCO________________________________________________________________________

		




































}// NÃO EXCLUIR 
