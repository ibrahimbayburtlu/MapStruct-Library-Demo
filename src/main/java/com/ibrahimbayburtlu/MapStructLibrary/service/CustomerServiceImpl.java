package com.ibrahimbayburtlu.MapStructLibrary.service;

import com.ibrahimbayburtlu.MapStructLibrary.dto.CustomerDTO;
import com.ibrahimbayburtlu.MapStructLibrary.entity.Customer;
import com.ibrahimbayburtlu.MapStructLibrary.mapper.CustomerMapper;
import com.ibrahimbayburtlu.MapStructLibrary.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(CustomerDTO customerDTO){

        Customer customer = CustomerMapper.INSTANCE.customerDTOToCustomer(customerDTO);

        return customerRepository.save(customer);
    }
}
