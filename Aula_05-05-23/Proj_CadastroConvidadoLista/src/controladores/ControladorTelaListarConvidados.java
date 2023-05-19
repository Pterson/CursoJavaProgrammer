package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ControladorTelaListarConvidados implements ActionListener{
	
	JFrame frameMenuConvidadoRecebido;
	JFrame frameTelaListaConvidadosRecebido;
	
	public ControladorTelaListarConvidados(JFrame frameMenuConvidadoRecebido, JFrame frameTelaListaConvidadosRecebido) {
		
		this.frameMenuConvidadoRecebido = frameMenuConvidadoRecebido;
		this.frameTelaListaConvidadosRecebido = frameTelaListaConvidadosRecebido;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		frameMenuConvidadoRecebido.setVisible(true);
		frameTelaListaConvidadosRecebido.setVisible(false);
		
	}
	
}
