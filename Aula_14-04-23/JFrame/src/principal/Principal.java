package principal;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {

		JFrame frame = new JFrame("FUNCIONA MEU CODIGO"); // Cria um novo JFrame com um título
		
		frame.setSize(400, 400); // Define o tamanho do frame em pixels (largura x altura)
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a ação padrão ao fechar o frame
		
		frame.setVisible(true); // Torna o frame visível
		
	}

}
