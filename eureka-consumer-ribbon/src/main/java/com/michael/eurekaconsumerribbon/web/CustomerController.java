package com.michael.eurekaconsumerribbon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/getClient")
    public String getClient(){
        return restTemplate.getForObject("http://eureka-client/getService", String.class);
    }



}
