package com.michael.eurekaribbonhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String getClient() {
        return restTemplate.getForObject("http://eureka-client/getService", String.class);
    }

    public String fallback() {
        return "fallback";
    }
}
