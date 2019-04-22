package com.demo.employee.search.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface GreetController {

    @RequestMapping("/greeting")
    public String greet();

}
