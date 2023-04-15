package principal;

import gui.GuiConvidados;

public class Principal {

	public static void main(String[] args) {


//======INICIA OBJETO MENU (INSTANCIA DO OBJETOS A PARTIR DAS CLASSES)____________________________________		
				GuiConvidados guiMenu = new GuiConvidados();
				guiMenu.menu(); // INVOCANDO O METODO MENU DA CLASSE GUI 

	}

}




/*
Cadastro de convidado:

	Convidado
		Nome
		Cpf

	Convidado Vip

		tipoVip(String)

	ConvidadoNormal

		tipoNormal(String)


Necessidades:
1 - Criar um menu para o usuario escolher qual tipo de convidado ele deseja cadastrar.(Use JoptionPane)
2 - O usuario pode cadastrar quantas vezes quiser.
3 - Registrar todos os dados cadastrados em algum arquivo.
4 - Encapsulamento obrigatorio.



 */