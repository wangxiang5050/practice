package com.example.configdemo.prop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 读取application.xml中的配置
 */
@RestController
@RequestMapping("/value")
public class ValueController {

    @Value("${prop.name}")
    private String name;

    @Autowired
    private Environment environment;

    @RequestMapping("/get")
    public String testValue() {
        return name + "," + environment.getProperty("prop.name");
    }
}
