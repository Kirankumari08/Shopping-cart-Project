package com.shoppingcart.ShoppingBackEnd.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoppingcart.ShoppingBackEnd.dao.UserDAO;
import com.shoppingcart.ShoppingBackEnd.domain.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean save(User user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();

			return false;
		}
	}

	@Override
	public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();

			return false;
		}
	}

	@Override
	public User get(String emailID) {

		return sessionFactory.getCurrentSession().load(User.class, emailID);

	}

	@Override
	public boolean delete(String email) {
		try {
			sessionFactory.getCurrentSession().delete(get(email));
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();

			return false;
		}
	}
     
	public User validate(String emailID, String password) {
	return (User)	sessionFactory.getCurrentSession().createCriteria(User.class).
		add(Restrictions.eq("email", emailID))
		.add(Restrictions.eq("password", password)).uniqueResult();
	}

	@Override
	public List<User> list() {
		return sessionFactory.getCurrentSession().createQuery("from user").getResultList();
		
	}
}
