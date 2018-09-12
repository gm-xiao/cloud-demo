package com.michael.eurekaconsumerfeign.web;

import com.michael.eurekaconsumerfeign.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/getClient")
    public String getClient(){
        return customerService.getService();
    }

}
