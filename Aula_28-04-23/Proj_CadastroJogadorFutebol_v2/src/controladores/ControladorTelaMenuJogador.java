package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidades.Jogador;
import repositorio.RepositorioJogador;
import telas.TelaCadastroJogador;
import telas.TelaListarJogador;

public class ControladorTelaMenuJogador implements ActionListener {

	JFrame frameTelaMenuPrincipal;
	JTextField respostaTelaMenuPrincipal;
	
	public ControladorTelaMenuJogador(JFrame frameTelaMenuPrincipal, JTextField respostaTelaMenuPrincipal) {
		this.frameTelaMenuPrincipal = frameTelaMenuPrincipal;
		this.respostaTelaMenuPrincipal = respostaTelaMenuPrincipal;
	}
	
	TelaCadastroJogador telaCadastroJogador = new TelaCadastroJogador();
	TelaListarJogador telaListarJogador = new TelaListarJogador();

	RepositorioJogador repositorioJogador = new RepositorioJogador();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String resposta = respostaTelaMenuPrincipal.getText();
		
		switch (resposta) {
			case "1": 
				
				telaCadastroJogador.criarTelaCadastroJogador(frameTelaMenuPrincipal,repositorioJogador);
				frameTelaMenuPrincipal.setVisible(false);
				
				break;
			case "2": 
				
				telaListarJogador.listarJogador(repositorioJogador.retornaListaJogadores(), frameTelaMenuPrincipal);
				frameTelaMenuPrincipal.setVisible(false);
				
				break;
		
		
		}
	}
	
	//Para teste
	public void listarTeste(List<Jogador> listaJogadores){
		
		for(Jogador jogador: listaJogadores ){
			System.out.println(jogador.getNome());
			System.out.println(jogador.getCpf());
			
		}
		
	}

}