package com.som.bookservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "user-service",
        url = "http://localhost:8081"
)
public interface UserClient {

    @GetMapping("/users/test")
    String getUserServiceMessage();
}