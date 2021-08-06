package br.com.DIO;

import br.com.DIO.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		/* Para chamar a classe gato 
		 * Para importar a classe 
		 * selecione a classe e precione
		 * CTRL + SHIFT + O */
		Gato gato = new Gato();
		Livros livro = new Livros();
		
		// TODO Auto-generated method stub
		/*int a = 2;
		int b = 3;
		System.out.println("Hello! World! " + (a+b));
		*/
		System.out.println(gato);
		System.out.println(livro);
	
	}

}
class Livros {
	private String nome;
	private String npag;
	
}