package br.com.john.library.products;

import br.com.john.library.Publisher;

public class Magazine implements Product, Promotional {
	
	private String name;
	private String description;
	private double price;
	private Publisher publisher;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescricao() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Publisher getEditora() {
		return publisher;
	}
	public void setEditora(Publisher publisher) {
		this.publisher = publisher;
	}
	
	public boolean applyDiscountOf(double percentage) {
		if (percentage > 0.1) {
			return false;
		}
		double discount = getPrice() * percentage;
		setPrice(getPrice() - discount);
		return true;
	}
}
