package br.com.john.library.products;

import br.com.john.library.Author;

public abstract class Book implements Product {
	
	private String name;
	private String description;
	private double price;
	private String isbn;
	private Author author;

	
	public Book(Author author) {
		this.author = author;
		this.isbn = "000-00-00000-00-0";
	}

	public abstract boolean applyDiscountOf(double percentage);
	
	
	public Book() {
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	boolean haveAuthor() {
		return this.author != null;
	}

	public void showDetails() {
		System.out.println("Mostrando detalhes do book ");
		System.out.println("Name: " + name);
		System.out.println("Descricao: " + description);
		System.out.println("Price: " + price);
		System.out.println("ISBN: " + isbn);
		
		if (this.haveAuthor()) {
			author.showDetails();
		}
		
		System.out.println("--");
	}
	
}
