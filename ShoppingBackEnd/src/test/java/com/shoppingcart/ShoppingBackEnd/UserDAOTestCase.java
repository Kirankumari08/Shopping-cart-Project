package com.shoppingcart.ShoppingBackEnd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.shoppingcart.ShoppingBackEnd.dao.UserDAO;
import com.shoppingcart.ShoppingBackEnd.daoimpl.UserDAOImpl;
import com.shoppingcart.ShoppingBackEnd.domain.User;

public class UserDAOTestCase {

	private User user;
	private UserDAO userDAO;

	@Before
	public void setUp() throws Exception {
		user = new User();
		userDAO = new UserDAOImpl();

	}

	@Test
	public void saveuserTestCase() {
		user.setEmail("kiranbhagat@gmail.com");
		user.setAddress("sec-48 noida");
		user.setMobile("7056290128");
		user.setName("kiran");
		user.setPassword("1234");

		boolean result = userDAO.save(user);
		assertEquals("testing user save", true, result);

	}

	@Test
	public void getUserTestCase() {
		user.setEmail("kiranbhagat@gmail.com");
		user.setAddress("sec-48 noida");
		user.setMobile("7056290128");
		user.setName("kiran");
		user.setPassword("1234");
	}

	@Test
	public void updateUserTestCase() {
		user.setEmail("kiranbhagat@gmail.com");
		user.setAddress("sec-48 noida");
		user.setMobile("7056290128");
		user.setName("kiran");
		user.setPassword("1234");

		boolean result = userDAO.update(user);
		assertEquals("testing user update", null, result);

	}

	@Test
	public void setUserTestCase() {
		String name = "kinnu";
		User result = userDAO.get(name);
		assertEquals("testing user update", null, result);

	}

	@Test
	public void deleteUserTestCase() {
	}
}
