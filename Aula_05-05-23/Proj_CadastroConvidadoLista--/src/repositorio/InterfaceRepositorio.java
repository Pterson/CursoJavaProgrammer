package repositorio;

import java.util.List;

import entidades.Convidado;

public interface InterfaceRepositorio {
	
	public void salvarConvidado(Convidado convidado);
	
	public List<Convidado> retornarListaConvidados();
	
	public boolean deletarConvidado(Convidado convidado);
	
	public Convidado buscarConvidado(String convite);
		
}
