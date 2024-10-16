package com.your_meeting.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/test123")
    public String hello() {
        return "Hello, Worldasdfasdf!";
    }
}
