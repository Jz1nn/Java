package br.com.john.library;

public class Author {

	String name;
	String email;
	String cpf;
	
	public void showDetails() {
		System.out.println("Mostrando detalhes do author ");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
