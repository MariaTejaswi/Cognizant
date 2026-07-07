package com.cognizant.spring_learn.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        System.out.println("Start authenticate()");
        System.out.println(authHeader);

        Map<String, String> map = new HashMap<>();

        map.put("token", "");

        System.out.println("End authenticate()");

        return map;
    }
}
