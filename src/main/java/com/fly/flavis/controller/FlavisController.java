package com.fly.flavis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlavisController {

    @GetMapping("/user")
    public String getUser(long id) {
        return "user1";
    }
}
