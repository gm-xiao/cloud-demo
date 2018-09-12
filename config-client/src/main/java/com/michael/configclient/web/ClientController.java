package com.michael.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping(value = "/appName")
    public String info(){
        return appName;
    }

}
