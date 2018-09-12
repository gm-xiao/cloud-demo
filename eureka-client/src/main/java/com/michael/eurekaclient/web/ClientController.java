package com.michael.eurekaclient.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${server.port}")
    private Integer port;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/getService")
    public String getService(){
        try {
            //Thread.sleep(5000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Services: " + discoveryClient.getServices() + "\n\nPort: " + port;
    }


}
