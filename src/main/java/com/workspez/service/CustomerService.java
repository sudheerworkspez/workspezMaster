package com.workspez.service;

import com.workspez.model.Customer;

public interface CustomerService {

	public Customer findCustomerName(String custCutomerName);

	public void saveCustomer(Customer customer);
}
