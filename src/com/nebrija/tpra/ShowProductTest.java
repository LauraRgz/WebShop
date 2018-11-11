package com.nebrija.tpra;

import org.junit.Test;

public class ShowProductTest {

	@Test
	public void test() {
		Product producto1 = new Product(123.0, "libro", 4, 6, "Books");
		producto1.showProduct();
	}

}