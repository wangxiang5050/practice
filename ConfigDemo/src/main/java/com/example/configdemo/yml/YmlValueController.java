package com.example.configdemo.yml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 读取application.yml中的配置
 */
@RestController
@RequestMapping("/yml")
public class YmlValueController {

    @Value("${yml.name}")
    private String name;

    @Autowired
    private Environment environment;

    @RequestMapping("/get")
    public String testValue() {
        return name + "," + environment.getProperty("yml.name");
    }
}
