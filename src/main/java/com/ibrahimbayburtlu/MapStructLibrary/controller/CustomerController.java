package com.ibrahimbayburtlu.MapStructLibrary.controller;

import com.ibrahimbayburtlu.MapStructLibrary.dto.CustomerDTO;
import com.ibrahimbayburtlu.MapStructLibrary.entity.Customer;
import com.ibrahimbayburtlu.MapStructLibrary.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    @Qualifier("customerServiceImpl")
    private CustomerService customerService;

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.addCustomer(customerDTO);
    }
}
