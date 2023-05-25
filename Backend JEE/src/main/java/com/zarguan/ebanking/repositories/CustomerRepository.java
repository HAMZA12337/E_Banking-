package com.zarguan.ebanking.repositories;

import com.zarguan.ebanking.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findCustomerByFirstNameContainsOrLastNameContains(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
