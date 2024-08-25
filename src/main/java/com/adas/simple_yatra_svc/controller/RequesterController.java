package com.adas.simple_yatra_svc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RequesterController {

    @GetMapping("/requester/hello")
    public String greetings() {
        return "Welcome to RequesterController apis";
    }

}
