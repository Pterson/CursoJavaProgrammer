package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidades.Usuario;
import repositorio.RepositorioConvidado;
import telas.TelaCadastroConvidado;
import telas.TelaDeletarConvidados;
import telas.TelaListarConvidados;
import telas.TelaLocalizaAlterarConvidado;


public class ControladorTelaMenuPrincipal implements ActionListener {

	JFrame frameTelaMenuPrincipal;
	JTextField textRespostaTelaMenuPrincipal;
	Usuario usuarioEncontradoRecebida;
	
	public ControladorTelaMenuPrincipal(JFrame frameTelaMenuPrincipal, JTextField textRespostaTelaMenuPrincipal,
			Usuario usuarioEncontradoRecebida) {
		
		this.frameTelaMenuPrincipal = frameTelaMenuPrincipal;
		this.textRespostaTelaMenuPrincipal = textRespostaTelaMenuPrincipal;
		this.usuarioEncontradoRecebida = usuarioEncontradoRecebida;
	}

	TelaCadastroConvidado telaCadastroConvidado = new TelaCadastroConvidado();
	
	TelaListarConvidados telaListarConvidados = new TelaListarConvidados();

	TelaDeletarConvidados telaDeletarConvidados = new TelaDeletarConvidados();
	
	TelaLocalizaAlterarConvidado telaLocalizaAlterarConvidado = new TelaLocalizaAlterarConvidado();
	
	RepositorioConvidado repositorioConvidado = new RepositorioConvidado();

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String menu = textRespostaTelaMenuPrincipal.getText();
		
		switch (menu) {
		
		case "1": 
			
			telaCadastroConvidado.cadastrarConvidado(frameTelaMenuPrincipal, repositorioConvidado);
			frameTelaMenuPrincipal.setVisible(false);			
			break;
			
			
		case "2": 
			
			telaListarConvidados.listarConvidados(repositorioConvidado.retornarListaConvidados(), frameTelaMenuPrincipal);		
			frameTelaMenuPrincipal.setVisible(false);			
			break;
			
			
		case "3": 
			
			telaDeletarConvidados.deletarConvidados(repositorioConvidado.retornarListaConvidados(), frameTelaMenuPrincipal, repositorioConvidado);
			frameTelaMenuPrincipal.setVisible(false);
			break;
			
		
		case "4":
			
			telaLocalizaAlterarConvidado.criarTelaLocalizaAlterarConvidado(repositorioConvidado.retornarListaConvidados(), frameTelaMenuPrincipal, repositorioConvidado);
			frameTelaMenuPrincipal.setVisible(false);
			break;
			
	    }
		
	}

}
