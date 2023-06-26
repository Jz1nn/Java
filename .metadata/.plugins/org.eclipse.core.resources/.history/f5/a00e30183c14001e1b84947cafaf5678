package library;

import br.com.john.library.products.Book;
import br.com.john.library.products.Product;
import br.com.john.library.products.Magazine;

public class ShoppingCart {
	
	private double total;

	
	public void add(Book book) {
		System.out.println("Adicionando: " + book);
		book.applyDiscountOf(0.05);
		total += book.getPrice();
	}
	
	public void add(Magazine magazine) {
		System.out.println("Adicionando: " + magazine);;
		magazine.applyDiscountOf(0.05);
		total += magazine.getPrice();
	}
	
	public void add(Product product) {
		System.out.println("Adicionando: " + product);
		total += product.getPrice();
	}
	public double getTotal() {
		return total;
	}
}
