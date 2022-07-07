package com.greatlearning.customer.relationship.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import com.greatlearning.customer.relationship.entity.Customer;


@Repository
public class CustomerDaoImpl implements ICustomerDao {
	
	private SessionFactory sessionFactory;
	
	private Session session;
	
	public CustomerDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		}catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
	}


	@Override
	public Customer insertCustomerDetails(Customer customer) {
		session.save(customer);
		System.out.println("customer info saved." + customer);
		
		return customer;
	}

	@Override
	public Customer updateCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomerDetails(int customerId) {
		session.delete(customerId);
		System.out.println("customer deleted." + customerId);
		
		return false;
	}

	public List<Customer> retrieveCustomerDetails() {
	
		return  session.createQuery("Select s from Customer s", Customer.class).getResultList();
	}

}
