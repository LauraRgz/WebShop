package com.nebrija.tpra;

import org.junit.Test;

public class AddProductTest {

	@Test
	public void test() {
		Product producto1 = new Product(123.0, "libro", 4, 6, "Books");
		ProductList lista2 = new ProductList();
		lista2.addProduct(producto1);
	}

}
