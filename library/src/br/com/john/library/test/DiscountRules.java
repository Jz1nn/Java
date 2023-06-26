package br.com.john.library.test;

import br.com.john.library.Author;

import br.com.john.library.products.Book;
import br.com.john.library.products.MiniBook;
import br.com.john.library.products.Ebook;

public class DiscountRules {
	public static void main(String[] args) {
		
		Author author = new Author();
		author.setName("John Willian");
		
		Book book = new MiniBook(author);
		book.setPrice(39.90);
		
		
		if (!book.applyDiscountOf(0.3)) {
			System.out.println("Desconto no book nao pode ser maior do que 30%");
		} else {
			System.out.println("Price do book com discount: " + book.getPrice());
		}
		
		Ebook ebook = new Ebook(author);
		ebook.setPrice(29.90);
		
		if (!ebook.applyDiscountOf(0.15)) {
			System.out.println("Desconto no ebook nao pode ser maior do que 15%");
		} else {
			System.out.println("Price do ebook com discount: " + ebook.getPrice());
		}
	}
}
