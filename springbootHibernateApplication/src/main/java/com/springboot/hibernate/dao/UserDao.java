//package com.springboot.hibernate.dao;
//
//import java.util.List;
//
//import org.hibernate.Criteria;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.springboot.hibernate.entity.Address;
//import com.springboot.hibernate.entity.Student;
//import com.springboot.hibernate.entity.User;
//import com.springboot.hibernate.exceptions.UserNotFoundException;
//
//@Repository
//@Transactional
//public class UserDao {
//
//	@Autowired
//	private SessionFactory sessionFactory;
//
//	public Session getSession() {
//		Session session = sessionFactory.getCurrentSession();
//		if (session == null) {
//			session = sessionFactory.openSession();
//		}
//		return session;
//	}
//
//	public void saveUser(User user) {
//		getSession().save(user);
//	}
//
//	public List<User> getAllusers() {
//
//		Criteria criteria = getSession().createCriteria(User.class);
//
//		return criteria.list();
//	}
//
//	public void deleteUser() {
//		Query queryObj = getSession().createQuery("DELETE FROM User");
//		queryObj.executeUpdate();
//	}
//
//	public User getById(int id) {
//		User user;
//		user = getSession().get(User.class, id);
//
//		if (user == null) {
//			throw new UserNotFoundException("user not found with id " + id);
//		}
//
//		return user;
//
//	}
//
//	public void deleteUser(int id) {
//		getSession().delete(getById(id));
//
//	}
//
//	public void update(int id, User user) {
//		User userDetails = getById(id);
//		userDetails.setName(user.getName());
//		getSession().saveOrUpdate(userDetails);
//
//	}
//
//	public void saveUserr() {
//		User user = new User();
//		user.setName("Narru");
//		Address address1 = new Address("chennai", "tmail");
//		Address address2 = new Address("hyd", "telangana");
//		Address address3 = new Address("nellore", "Andhra");
//		Address address4 = new Address("bangalore", "karnataka");
//
//		user.getAddress().add(address1);
//		user.getAddress().add(address2);
//		user.getAddress().add(address3);
//		user.getAddress().add(address4);
//		getSession().save(user);
//	}
//
//	public void saveStudent(Student user) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
