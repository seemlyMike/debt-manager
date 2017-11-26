package com.seemlymike.debtmanager.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping(value = "/hello")
public class GreetingController {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "Hello m8, sup?";
    }
}
