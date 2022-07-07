package com.greatlearning.customer.relationship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.customer.relationship.dao.ICustomerDao;
import com.greatlearning.customer.relationship.entity.Customer;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	
	@Autowired
	private ICustomerDao customerDao;
	
	@Override
	public Customer insert(Customer customer) {
		
		return customerDao.insertCustomerDetails(customer);
	}

	@Override
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		
		return customerDao.deleteCustomerDetails(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerDao.retrieveCustomerDetails();
	}

}
