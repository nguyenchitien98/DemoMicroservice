package com.example.serviceA.controller;

import com.example.serviceA.client.ServiceBClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-a")
public class ServiceAController {

    private final ServiceBClient serviceBClient;

    public ServiceAController(ServiceBClient serviceBClient) {
        this.serviceBClient = serviceBClient;
    }

    @GetMapping("/call-b")
    public String callServiceB() {
        return "Service A gọi Service B: " + serviceBClient.getMessage();
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
