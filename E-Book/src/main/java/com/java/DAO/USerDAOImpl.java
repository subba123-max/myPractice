package com.java.DAO;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional; 


import com.java.model.User;

@Repository
@Transactional
public class USerDAOImpl implements UserDAO {

	@Autowired
	public HibernateTemplate hibernateTemplate;
	
	@Override
	public int userReistration(User user) {
		// TODO Auto-generated method stub
		System.out.println("user DAOImpl"+user);
		return (Integer) hibernateTemplate.save(user);
	}
	
	
	@Override
	public List<User> verifyUser(String username ,String password) {
		System.out.println("inside verifyuser");

	DetachedCriteria dc=DetachedCriteria.forClass(User.class); 
	dc.add(Restrictions.and(Restrictions.eq("username", username),Restrictions.eq("password", password))); 
	List<User> user= (List<User>) hibernateTemplate.findByCriteria(dc); 
		
		return user;
		
	}

}
