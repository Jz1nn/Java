package br.com.john.library.test;

import br.com.john.library.Author;

import library.ShoppingCart;
import br.com.john.library.products.Ebook;
import br.com.john.library.products.PhysicalBook;

public class SalesRecord {

	public static void main(String[] args) {
		
		Author author = new Author();
		author.setName("Mauricio Aniche");
		
		PhysicalBook fisico = new PhysicalBook(author);
		fisico.setName("Test-Driven Development");
		fisico.setPrice(59.90);
		
		
		Ebook ebook = new Ebook(author);
		ebook.setName("Test-Driven Development");
		ebook.setPrice(29.90);
		
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.add(fisico);
		cart.add(ebook);
		
		System.out.println("Total " + cart.getTotal());
	}
}