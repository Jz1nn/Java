package br.com.john.library.products;

import br.com.john.library.Author;

public class PhysicalBook extends Book implements Promotional {

	public PhysicalBook(Author author) {
		super(author);
	}
	
	public double getPrintingFee() {
		return this.getPrice() * 0.05;
	}
	
	public boolean applyDiscountOf(double percentage) {
		if (percentage > 0.3) {
			return false;
		}
		double discount = getPrice() * percentage;
		setPrice(getPrice() - discount);
		System.out.println("aplicando discount no LivroFisico");
		return true;
	}
}
