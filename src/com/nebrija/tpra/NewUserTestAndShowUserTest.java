package com.nebrija.tpra;

import org.junit.Test;

public class NewUserTestAndShowUserTest {

	@Test
	public void test() {
		User user1 = new User("laura@gmail.com", "Laura", "Laura1");
		user1.showUser(user1);
	}

}
