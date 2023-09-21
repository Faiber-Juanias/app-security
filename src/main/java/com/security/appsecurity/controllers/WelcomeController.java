package com.security.appsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/welcome")
public class WelcomeController {

    @GetMapping
    public Map<String, String> welcome() {
        // ...Business Logic
        return Collections.singletonMap("msg", "Welcome");
    }

}
