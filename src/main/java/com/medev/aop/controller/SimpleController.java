package com.medev.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/aop")
public class SimpleController {

    @GetMapping()
    public String simpleGetMethod() {
        return "Get Request";
    }

    @PostMapping()
    public String simplePostMethod() {
        return "Post Request";
    }
}
