package com.ibrahimbayburtlu.MapStructLibrary.service;

import com.ibrahimbayburtlu.MapStructLibrary.dto.CustomerDTO;
import com.ibrahimbayburtlu.MapStructLibrary.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer addCustomer(CustomerDTO customerDTO);
}
