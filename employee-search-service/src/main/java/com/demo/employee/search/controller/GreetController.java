package com.demo.employee.search.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GreetController {
    @Value("${name}")
    private String name;

    @RequestMapping("/greeting")
    public String greet() {
        return String.format("Hello %s", name);
    }
}
