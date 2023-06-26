package br.com.john.library.test;

import br.com.john.library.Author;

import br.com.john.library.products.Book;
import br.com.john.library.products.PhysicalBook;

public class BookRegistration {
	public static void main(String[] args) {
		
		Author author = new Author();
		author.setName("John Willian");
		author.setEmail("john@email.com");
		author.setCpf("123.456.789.10");

		Book book = new PhysicalBook(author);
		book.setName("Java 8 pratico");
		book.setDescription("Novos recursos da linguagem");
		book.setPrice(59.90);
		book.setIsbn("978-85-66250-46-6");

		book.showDetails();

		
		Author anotherAuthor = new Author();
		anotherAuthor.setName("Paulo Silveira");
		anotherAuthor.setEmail("paulo@email.com");
		anotherAuthor.setCpf("123.456.789.10");
		
		Book anotherBook = new PhysicalBook(anotherAuthor);
		anotherBook.setName("Logica de Programacao");
		anotherBook.setDescription("Crie seus primeiros programas");
		anotherBook.setPrice(59.90);
		anotherBook.setIsbn("978-85-66250-22-0");
		
		anotherBook.showDetails();
	}
}
