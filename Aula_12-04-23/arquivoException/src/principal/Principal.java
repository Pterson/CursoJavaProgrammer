package principal;

import servicoArquivo.ManipulaArquivo;

public class Principal {

	public static void main(String[] args) {
		
		
		
		String path = "D:\\Repositorio_GitHub\\Meu_Repositorio\\CursoJavaProgrammer\\Aula_12-04-23\\arquivoException\\TesteDoArquivo.txt";
		
		
			ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
			manipulaArquivo.escreverNoArquivo(path);
		

	}

}
