package com.klef.springboot.service;

import java.util.List;

import com.klef.springboot.model.Customer;

public interface CustomerService 
{
	public String customerRegistration(Customer c);
	public List<Customer>viewall();
}
