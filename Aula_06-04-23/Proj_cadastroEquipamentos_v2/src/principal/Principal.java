package principal;

import entidade.Furadeira;
import entidade.Makita;
import telas.TelasEquipamentos;

public class Principal {

	public static void main(String[] args) {
		
//======INICIANDO OBJETOS________________________________________________________________________________
		Furadeira furadeira = new Furadeira();
		Makita makita = new Makita();		
		TelasEquipamentos telasCadastro = new TelasEquipamentos();		
		TelasEquipamentos telasExibe = new TelasEquipamentos();
		
		
		
//======BLOCO BUSCA INFORMAÇÕES DA TELA DE CADASTRADO (GET)______________________________________________
		furadeira = telasCadastro.cadastrarFuradeira(furadeira);
		
//======BLOCO EXIBE INFORMAÇÕES CADASTRADAS DA TELA DE CADASTRADO (SET)__________________________________
		furadeira = telasExibe.exibeFuradeira(furadeira);
		
		
			
		

	}

}
