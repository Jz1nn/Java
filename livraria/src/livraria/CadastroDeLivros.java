package livraria;

public class CadastroDeLivros {
	public static void main(String[] args) {
		
		Autor autor=new Autor();
		autor.nome="John Willian";
		autor.email="john@email.com";
		autor.cpf="123.456.789.10";
				
		Livro livro=new Livro();
		livro.nome="Java 8 pratico";
		livro.descricao="Novos recursos da linguagem";
		livro.valor=59.90;
		livro.isbn="978-85-66250-46-6";
		
		livro.autor=autor;

		livro.mostrarDetalhes();

		Autor outroAutor=new Autor();
		outroAutor.nome="Paulo Silveira";
		outroAutor.email="paulo@email.com";
		outroAutor.cpf="123.456.789.10";
		
		Livro outroLivro=new Livro();
		outroLivro.nome="Logica de Programacao";
		outroLivro.descricao="Crie seus primeiros programas";
		outroLivro.valor=59.90;
		outroLivro.isbn="978-85-66250-22-0";
		
		outroLivro.autor=outroAutor;
		
		outroLivro.mostrarDetalhes();
	}
}
