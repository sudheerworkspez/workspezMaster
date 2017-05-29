package com.workspez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.workspez.model.Customer;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query(value = "from Customer c where c.custCutomerName=?1")
	public Customer findCustomerName(String custCutomerName);
}
