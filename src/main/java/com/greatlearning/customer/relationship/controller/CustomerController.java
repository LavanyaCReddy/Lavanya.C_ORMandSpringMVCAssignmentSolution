package com.greatlearning.customer.relationship.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.greatlearning.customer.relationship.entity.Customer;
import com.greatlearning.customer.relationship.service.ICustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@Controller
@RequestMapping("/Customer")
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/show-form")
public String showFormToUser() {
		return "Welcome";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/delete-customer")
	public String deleteCustomerDetails(@RequestParam("id") Integer id) {
		System.out.println("method called with id is : " +id);
		if(customerService.deleteCustomer(id)) {
			System.out.println("Customer deleted");
		}else {
			System.out.println("Customer not deleted");
		}
		return "redirect:show-customers";
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/new-customer")
	public String insertCustomerDetails(@RequestParam("id") Integer id, @RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname, @RequestParam("email") String email) {
		Customer customer = new Customer(id, firstname, lastname, email);
		customerService.insert(customer);
		return "redirect:show-customers";
		
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/show-customers")
	public ModelAndView getCustomerDetails(ModelAndView mav) {
		List<Customer> customers = customerService.getAllCustomers();
		mav.setViewName("customer-info");
		mav.addObject("customerinfo", customers);
		return mav;
	}
}