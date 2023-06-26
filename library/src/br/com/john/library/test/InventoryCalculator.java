package br.com.john.library.test;

public class InventoryCalculator {

	public static void main(String[] args) {
		
		double sum = 0;
		
		for (double i = 0; i < 35; i++) {
			sum += 59.90;
		}
		System.out.println("O total em estoque e " + sum);
		
		if(sum < 150) {
			System.out.println("Seu estoque esta muito baixo!");
		} else if(sum >= 2000)	{
			System.out.println("Seu estoque esta muito alto!");
		} else {
			System.out.println("Seu estoque esta bom");
		}
	}
}
