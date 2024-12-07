package com.klef.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.springboot.model.Customer;
import com.klef.springboot.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public String customerRegistration(Customer c) {
		customerRepository.save(c);
		return "Registered Success";
	}

	@Override
	public List<Customer> viewall() 
	{
		return customerRepository.findAll();
	}

}
