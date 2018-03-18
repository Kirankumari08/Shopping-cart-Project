package com.shoppingcart.ShoppingBackEnd.dao;

import java.util.List;

import com.shoppingcart.ShoppingBackEnd.domain.User;

public interface UserDAO {

	boolean save(User user);

	boolean update(User user);

	public User get(String emailID);

	public boolean delete(String emailID);

	public User validate(String user, String password);

	public List<User> list();

}
