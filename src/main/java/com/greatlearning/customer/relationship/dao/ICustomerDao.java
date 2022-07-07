package com.greatlearning.customer.relationship.dao;

import java.util.List;

import com.greatlearning.customer.relationship.entity.Customer;

public interface ICustomerDao {
	
	public Customer insertCustomerDetails(Customer customer);
	
	public Customer updateCustomerDetails(Customer customer);
	
	public boolean deleteCustomerDetails(int customerId);
	
	public List<Customer> retrieveCustomerDetails();

}
