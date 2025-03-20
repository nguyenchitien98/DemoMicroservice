package com.example.serviceA.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "service-b", url = "http://localhost:8080/service-b")
@FeignClient(name = "service-b")
public interface ServiceBClient {
    @GetMapping("/service-b/message")
    String getMessage();
}
