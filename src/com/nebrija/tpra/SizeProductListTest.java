package com.nebrija.tpra;

import org.junit.Test;

public class SizeProductListTest {

	@Test
	public void test() {
		Product producto1 = new Product(123.0, "libro", 4, 6, "Books");
		Product producto2 = new Product(1223.0, "libro2", 42, 26, "Books");
		ProductList lista2 = new ProductList();
		lista2.addProduct(producto1);
		lista2.addProduct(producto2);
		System.out.println(lista2.size());
	}

}
