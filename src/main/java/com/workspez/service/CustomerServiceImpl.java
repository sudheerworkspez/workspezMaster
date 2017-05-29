package com.workspez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workspez.model.Customer;
import com.workspez.repository.CustomerRepository;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer findCustomerName(String custCutomerName) {
		return customerRepository.findCustomerName(custCutomerName);
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}

}
