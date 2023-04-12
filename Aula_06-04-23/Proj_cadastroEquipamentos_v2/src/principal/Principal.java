package principal;


import entidade.Furadeira;
import entidade.Makita;
import telas.TelasEquipamentos;

public class Principal {

	public static void main(String[] args) {

//======INICIA OBJETO MENU (INSTANCIA DO OBJETOS A PARTIR DAS CLASSES)____________________________________		
		TelasEquipamentos telasMenu = new TelasEquipamentos();
		telasMenu.menu(); // invoca o metodo menu 

		/*
		//======INICIANDO OBJETOS (INSTANCIANDO OBJETOS A PARTIR DAS CLASSES)____________________________________
				Furadeira furadeira = new Furadeira();
				Makita makita = new Makita();		
				TelasEquipamentos telasCadastro = new TelasEquipamentos();		
				TelasEquipamentos telasExibe = new TelasEquipamentos();
				
		//======BLOCO BUSCA INFORMAÇÕES DA TELA DE CADASTRADO (GET)______________________________________________
				furadeira = telasCadastro.cadastrarFuradeira(furadeira);
				makita = telasCadastro.cadastrarMakita(makita);
				
		//======BLOCO EXIBE INFORMAÇÕES CADASTRADAS DA TELA DE CADASTRADO (SET)__________________________________
				furadeira = telasExibe.exibeFuradeira(furadeira);
				makita = telasExibe.exibeMakita(makita);
				*/		
	
	}

}
