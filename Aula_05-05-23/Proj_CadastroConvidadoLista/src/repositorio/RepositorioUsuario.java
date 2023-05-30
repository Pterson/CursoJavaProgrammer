package repositorio;

import java.util.List;

import entidades.Usuario;
import persistencia.UsuarioDao;

public class RepositorioUsuario implements InterfaceUsuario {
	
	UsuarioDao usuarioDao = new UsuarioDao();  
	
	
	@Override
	public List<Usuario> retornaUsuarios() {
		
		return usuarioDao.retornaListaUsuarioDao();
	}

	@Override
	public Usuario buscarUsuario(String matricula) {
		
		for (Usuario usuarioBusca:retornaUsuarios() ) {
			if(matricula.equals(usuarioBusca.getMatricula())) {
				return usuarioBusca;
			}	
		}
		return null;
	}

}
