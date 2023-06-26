package br.com.john.library.products;

@FunctionalInterface
public interface Promotional {

	boolean applyDiscountOf(double percentage);
	
	default boolean applyDiscountOf10Porcento() {
		return applyDiscountOf(0.1);
	}
}
