package principal;

import javax.swing.JOptionPane;

import entidades.Furadeiras;
import entidades.Makitas;
import servicos.calcSalarioObtido;
import telas.TelasEquipamentos;

public class Principal {
	
	public static void main(String[] args) {

//======INICIANDO OBJETOS________________________________________________________________________________
		Furadeiras furadeiras = new Furadeiras();
		Makitas makitas = new Makitas();

		TelasEquipamentos telasEquipamentos = new TelasEquipamentos();  
        telasEquipamentos.ApresentaRecebeFuradeiras(furadeiras); 
    }
}
