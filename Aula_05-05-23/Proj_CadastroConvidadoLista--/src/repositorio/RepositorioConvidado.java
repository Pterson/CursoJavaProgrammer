package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Convidado;

public class RepositorioConvidado implements InterfaceRepositorio{
	
	List<Convidado> listaConvidados = new ArrayList<>();

	@Override
	public void salvarConvidado(Convidado convidado) {
		
		listaConvidados.add(convidado);
	}
	

	@Override
	public List<Convidado> retornarListaConvidados() {
		
		return listaConvidados;
	}
	

	@Override
	public boolean deletarConvidado(Convidado convidado) {
		
		boolean result;
		
		try {			
			listaConvidados.remove(convidado);
			result = true;
			
			
		} catch (Exception e) {
			result = false;
		}
		
		
		return result;
	}
	
	

	@Override
	public Convidado buscarConvidado(String convite) {
		
		
		for (Convidado convidadoVerificado:retornarListaConvidados()) {
			
			if(convidadoVerificado.getConvite().equals(convite)) {
				
				return convidadoVerificado;
			}
			
		}
		
		return null;
	}
	
}
