package gui;

import entidades.ConvidadoVip;

import javax.swing.JOptionPane;

import entidades.ConvidadoSimples;

public class GuiConvidados {
	
//======INICIA OBJETO MENU (INSTANCIA DO OBJETOS A PARTIR DAS CLASSES)____________________________________________________________________________
	ConvidadoVip cadConvidadoV = new ConvidadoVip();
	ConvidadoSimples cadConvidadoS = new ConvidadoSimples();
//=================================================================================================================================================	

//====================================================_____MENU CONVIDADOS_____====================================================================	
	public void menu() {
	
	String opcao = null;
	Boolean repeticao = true;
	
	do {
		
        opcao = (JOptionPane.showInputDialog("1. VIP  -  2. SIMPLES  -  3. Encerrar"));
	
        switch (opcao) {
			case "1": 
				System.out.println("Cadastrar: ");
				break;
			case "3": 
				System.out.println("Encerrar ");
				repeticao = false;
				break;
				
	
        		}
        
	}while (repeticao);
			
	}
	
	
 /*       switch (opcao) {
          
        
        case 1:
            	exibeConvidadoVip(cadastrarConvidadoVip(cadConvidadoV));
                break;
                
                
  //          case 2:
 //           	exibeConvidadoSimples(cadastrarConvidadoSimples(cadConvidadoS));
  //              break;
            case 3:
                JOptionPane.showMessageDialog(null, "Encerrando...");
                System.exit(0); // Encerra o programa
                break;
  //          default:
  //              JOptionPane.showMessageDialog(null, "OPS, tente novamente!!!");
        }*/
    

	
//=================================================================================================================================================		
	
//======BLOCO INSERÇÃO DE DADOS NO CADASTRO CONVIDADO VIP (SET)_____________________________________________________________________________________

	public ConvidadoVip cadastrarConvidadoVip(ConvidadoVip cadConvidadoV) {
		
		cadConvidadoV.setNome(JOptionPane.showInputDialog("Digite o nome do VIP: "));
		cadConvidadoV.setCpf(JOptionPane.showInputDialog("Digite o CPF do VIP: "));
		
		return cadConvidadoV;
	}
//=================================================================================================================================================	

	
	
	
//======BLOCO EXIBE INFORMAÇÕES CADASTRADAS CONVIDADO VIP (GET)_____________________________________________________________________________________	

	public ConvidadoVip exibeConvidadoVip(ConvidadoVip exibeConvidadoVip) {
		
		JOptionPane.showMessageDialog(null,"O nome do VIP cadastrado foi: " + exibeConvidadoVip.getNome());
		JOptionPane.showMessageDialog(null,"O CPF do VIP cadastrado foi: " + exibeConvidadoVip.getCpf());
		
		return exibeConvidadoVip;
	}
//=================================================================================================================================================	



















































}// NÃO EXCLUIR 
