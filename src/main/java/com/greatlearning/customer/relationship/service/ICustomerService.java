package com.greatlearning.customer.relationship.service;

import java.util.List;

import com.greatlearning.customer.relationship.entity.Customer;

public interface ICustomerService {
	
	public Customer insert(Customer customer);
	
	public Customer update(Customer customer);
	
	public boolean deleteCustomer(int customerId);
	
	public List<Customer> getAllCustomers ();
	
}
