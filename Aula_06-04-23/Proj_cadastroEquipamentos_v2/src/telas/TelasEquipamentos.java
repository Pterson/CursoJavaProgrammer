package telas;



import javax.swing.JOptionPane;

import arquivos.DadosDoBuffer;
import entidade.Furadeira;
import entidade.Makita;
import servicos.CalculaLucro;
import arquivos.DadosDoBuffer;



public class TelasEquipamentos {

//======INICIA OBJETO MENU (INSTANCIA DO OBJETOS A PARTIR DAS CLASSES)____________________________________		
	Furadeira cadFuradeira = new Furadeira();
	Makita cadMakita = new Makita();
	CalculaLucro calculalucro = new CalculaLucro();
/*====================================================_____MENU FERRAMENTAS_____===============================================================*/	
	
	public void menu() {
				
		int opcao;
		boolean sair = true;
		
	
		DadosDoBuffer dadosdobuffer = new DadosDoBuffer();
		
		do {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1. Furadeira  -  2. Makita  -  3. Sair"));
			
	        if (opcao == 1) {	        	
	        //	dadosdobuffer.salvaDadosFuradeira(cadastrarFuradeira()); **Outra opção de chamar os dados do cadastro
	        	
	        	cadFuradeira = cadastrarFuradeira();
	        	dadosdobuffer.salvaDadosFuradeira(cadFuradeira);
	        	exibeFuradeira(cadFuradeira);
	        }
	        
	        else if (opcao == 2) {
	            cadMakita = cadastrarMakita();
	            dadosdobuffer.salvaDadosMakita(cadMakita);
	            exibeMakita(cadMakita);
	        }
	        
	        else if (opcao == 3) {
	        	sair = false;
	            JOptionPane.showMessageDialog(null, "Saindo...");
	            System.exit(0); // Encerra a execução do programa
	        }
			else {
	            JOptionPane.showMessageDialog(null, "Opção Inválida!!!");
	        }
			
		} while (sair);
		
	}	

	
//======BLOCO WHILE - SEGUNDA OPÇÃO DE LAÇO		
	/*	public void menu() {

	
    int opcao = 0;
    while (opcao != 3) {
        opcao = Integer.parseInt(JOptionPane.showInputDialog("1. Furadeira  -  2. Makita  -  3. Sair"));

        if (opcao == 1) {
            exibeFuradeira(cadastrarFuradeira(cadFuradeira));
        }
        else if (opcao == 2) {
            exibeMakita(cadastrarMakita(cadMakita));
        }
        
        else if (opcao == 3) {
            JOptionPane.showMessageDialog(null, "Saindo...");
            System.exit(0); // Encerra a execução do programa
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Opção Inválida!!!");
        }
}
    
}*/
	
//======BLOCO SWITCH - TERCEIRA OPÇÃO DE LAÇO	
	/*
	MENU COM SWITCH CASE
	
	public void menu() {

	    int opcao = 0;
	    while (opcao != 3) {
	        opcao = Integer.parseInt(JOptionPane.showInputDialog("1. Furadeira  -  2. Makita  -  3. Sair"));

	        switch (opcao) {
	            case 1:
	                exibeFuradeira(cadastrarFuradeira(cadFuradeira));
	                break;
	            case 2:
	                exibeMakita(cadastrarMakita(cadMakita));
	                break;
	            case 3:
	                JOptionPane.showMessageDialog(null, "Saindo...");
	                System.exit(0); // Encerra a execução do programa
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Opção Inválida!!!");
	        }
	    }
	}
	*/

	
	
/*====================================================_____FURADEIRAS_____===============================================================*/
	
//======BLOCO INSERÇÃO DE DADOS NO CADASTRO FURADEIRA (SET)_____________________________________________________________________________________
	public Furadeira cadastrarFuradeira() {	
		
		Furadeira cadFuradeira = new Furadeira(); // Objeto vazio
		
		cadFuradeira.setMarca(JOptionPane.showInputDialog("Digite a marca da Furadeira: "));
		cadFuradeira.setCodigo(JOptionPane.showInputDialog("Digite o código para Furadeira: "));
		cadFuradeira.setTipoDeBrocas(JOptionPane.showInputDialog("Qual tipo de bronca para Furadeira: "));
		cadFuradeira.setValorDaCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de compra da furadeira:")));
		cadFuradeira.setValorDaVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de venda da furadeira:")));
		cadFuradeira.setLucro(calculalucro.LucroLiquido(cadFuradeira.getValorDaVenda(), cadFuradeira.getValorDaCompra()));
		return cadFuradeira;
	}
	
//======BLOCO EXIBE INFORMAÇÕES CADASTRADAS FURADEIRA (GET)_____________________________________________________________________________________
	public void exibeFuradeira(Furadeira exibeFuradeira) {
			
		JOptionPane.showMessageDialog(null,"CONFIRME AS INFORMAÇÕES CADASTRADOS");
		JOptionPane.showMessageDialog(null,"Marca da Furadeira: " + exibeFuradeira.getMarca());
		JOptionPane.showMessageDialog(null,"Código da Furadeira: " + exibeFuradeira.getCodigo());
		JOptionPane.showMessageDialog(null,"Tipo de broca da Furadeira: " + exibeFuradeira.getTipoDeBrocas());
		JOptionPane.showMessageDialog(null,"Valor de compra da Furadeira: " +exibeFuradeira.getValorDaCompra());
		JOptionPane.showMessageDialog(null,"Valor de venda da Furadeira: " + exibeFuradeira.getValorDaVenda());	
		JOptionPane.showMessageDialog(null,"Lucro obtido na furadeira: " + calculalucro.LucroLiquido(exibeFuradeira.getValorDaVenda(), exibeFuradeira.getValorDaCompra()));
	}
		
//======BLOCO EXIBE VALOR DO LUCRO FURADEIRA____________________________________________________________________________________________________
	
	public Furadeira exibeLucroFuradeira (Furadeira cadFuradeira) {
	
		CalculaLucro calcularlucro = new CalculaLucro();
	
	double lucro = calcularlucro.LucroLiquido(cadFuradeira.getValorDaCompra(), cadFuradeira.getValorDaVenda());
		
	return exibeLucroFuradeira(cadFuradeira);
	}		
		

/*=======================================================_____MAKITAS_____===============================================================*/	
	
	
//======BLOCO INSERÇÃO DE DADOS NO CADASTRO MAKITA (SET)_______________________________________________________________________________________	
	public Makita cadastrarMakita() {
		
		Makita cadMakita = new Makita();
		
		cadMakita.setMarca(JOptionPane.showInputDialog("Digite a marca da Makita: "));
		cadMakita.setCodigo(JOptionPane.showInputDialog("Digite código para Makita foi: "));
		cadMakita.setTipoDeDiscos(JOptionPane.showInputDialog("Qual tipo de disco para Makita: "));
		cadMakita.setValorDaCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de compra da Makita:")));
		cadMakita.setValorDaVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de venda da Makita:")));
		cadMakita.setLucro(calculalucro.LucroLiquido(cadMakita.getValorDaVenda(), cadMakita.getValorDaCompra()));
		return cadMakita;

	}
	
//======BLOCO EXIBE INFORMAÇÕES CADASTRADAS FURADEIRA (GET)_____________________________________________________________________________________
	public void exibeMakita(Makita exibeMakita) {
		
		JOptionPane.showMessageDialog(null,"CONFIRME AS INFORMAÇÕES CADASTRADOS");
		JOptionPane.showMessageDialog(null,"A marca cadastrada para Makita foi: " + exibeMakita.getMarca());
		JOptionPane.showMessageDialog(null,"O código cadastrado para Makita foi: " + exibeMakita.getCodigo());
		JOptionPane.showMessageDialog(null,"Tipo de disco da Makita: " + exibeMakita.getTipoDeDiscos());
		JOptionPane.showMessageDialog(null,"O valor de compra da Makita foi: "  + exibeMakita.getValorDaCompra());
		JOptionPane.showMessageDialog(null,"O valor de venda da Makita foi: "  + exibeMakita.getValorDaVenda());
		JOptionPane.showMessageDialog(null,"O lucro obtido na Makita: " + calculalucro.LucroLiquido(exibeMakita.getValorDaVenda(), exibeMakita.getValorDaCompra()));
    }
	
//======BLOCO EXIBE VALOR DO LUCRO MAKITA_______________________________________________________________________________________________________	
	public Makita exibeLucroMakita (Makita cadMakita) {
		
		CalculaLucro calcularlucro = new CalculaLucro();
		
	double lucro = calcularlucro.LucroLiquido(cadMakita.getValorDaCompra(), cadMakita.getValorDaVenda());
		
	return exibeLucroMakita(cadMakita);
	}
	
}	

