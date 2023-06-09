package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Convidado;
import persistencia.ConvidadoDao;

public class RepositorioConvidado implements InterfaceRepositorio{
	
	List<Convidado> listaConvidados = new ArrayList<>();
	
	ConvidadoDao convidadoDao = new ConvidadoDao();
	
	

	@Override
	public void salvarConvidado(Convidado convidado) {
		
		//listaConvidados.add(convidado);
		convidadoDao.salvarConvidadoBanco(convidado);
	}
	

	@Override
	public List<Convidado> retornarListaConvidados() {
		
		//return listaConvidados;
		return convidadoDao.buscarListaDeConvidados();
	}
	

	@Override
	public boolean deletarConvidado(Convidado convidado) {
		
		boolean result;
		
		result = convidadoDao.deletarConvidadoCpf(convidado);
		
		/*
		try {			
			listaConvidados.remove(convidado);
			result = true;
			
			
		} catch (Exception e) {
			result = false;
		}
		*/
		
		return result;
	}
		

	@Override
	public Convidado buscarConvidado(String cpf) { //Busca o convidado de acordo com o CONVITE, se não encontrar o metodo retorna null
		
		
		for (Convidado convidadoVerificado:retornarListaConvidados()) {
			
			if(convidadoVerificado.getCpf().equals(cpf)) {
				
				return convidadoVerificado;
			}
			
		}
		
		return null;
	}

	
	@Override
	public void alterarConvidado(Convidado convidadoNovo) {

		//listaConvidados.remove(convidadoAtual);
		//listaConvidados.add(convidadoNovo);
		
		convidadoDao.alterarConvidado(convidadoNovo);
		
	}
	
}
