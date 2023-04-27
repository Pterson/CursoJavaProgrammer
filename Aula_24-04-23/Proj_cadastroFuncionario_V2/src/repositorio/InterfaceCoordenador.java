package repositorio;

import entidades.Coordenador;

// Interface que dita as regras de todas classes, implementa e sobreescreve os metodos
public interface InterfaceCoordenador {

	// Estrutura do metodo que deve ser sobreEscrito pelas classes que implementam a interface
	public boolean salvarCoordenador(Coordenador coordenador);
}
