package br.com.john.library.products;

import br.com.john.library.Author;

public class MiniBook extends Book {

	public MiniBook(Author author) {
		super(author);
	}
	
	@Override
	public boolean applyDiscountOf(double percentage) {
		return false;
	}

	public double getPrice() {
		return getPrice();
	}
}
