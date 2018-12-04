package com.nebrija.tpra;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetAndSetCategoryTest {

	@Test
	public void test() {
		 Product libro1 = new Product(2.0, "libro1", 3, 4.5, "Books");
		 System.out.println(libro1.getCategoryProduct());
		 libro1.setCategoryProduct("Libros");
		 System.out.println(libro1.getCategoryProduct());
	}

}
