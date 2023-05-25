package com.zarguan.ebanking.services;
import com.zarguan.ebanking.DTOs.CustomerDTO;
import com.zarguan.ebanking.exceptions.CustomerNotFoundException;
import java.util.List;
public interface CostumerService {
    /*costumer methods */
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;
    /*get all customers */
    List<CustomerDTO> listCustomers();
    /*search for customers */
    List<CustomerDTO> searchCustomers(String keyword);
    //updating a costumer
    CustomerDTO updateCustomer(CustomerDTO customerDTO) throws CustomerNotFoundException;
    //delete  a costumer using id
    void deleteCustomer(Long customerId) throws CustomerNotFoundException;
}
