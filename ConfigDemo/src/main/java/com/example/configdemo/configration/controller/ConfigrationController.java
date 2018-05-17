package com.example.configdemo.configration.controller;

import com.example.configdemo.configration.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigrationController {

    @Autowired
    private Person person;

    @RequestMapping("/get")
    public String test() {
        return person.toString();
    }
}
