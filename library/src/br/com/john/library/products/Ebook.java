package br.com.john.library.products;

import br.com.john.library.Author;

public class Ebook extends Book implements Promotional {
	
	private String waterMark;
	
	
	public Ebook(Author author) {
		super(author);
	}
	
	@Override
	public boolean applyDiscountOf(double percentage) {
		if (percentage > 0.15) {
			return false;
		}
		double discount = this.getPrice() * percentage;
		this.setPrice(this.getPrice() - discount);
		return true;
	}
	
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public String getWaterMark() {
		return waterMark;
	}
}
