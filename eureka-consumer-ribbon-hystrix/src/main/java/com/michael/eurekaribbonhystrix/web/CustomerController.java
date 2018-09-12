package com.michael.eurekaribbonhystrix.web;

import com.michael.eurekaribbonhystrix.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/getClient")
    public String getClient(){
        return customerService.getClient();
    }

}
