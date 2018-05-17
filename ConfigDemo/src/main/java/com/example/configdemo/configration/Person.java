package com.example.configdemo.configration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "person")
@Component
@PropertySource(value="classpath:myConfig.yml")
public class Person {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    @Value("${hobbies}")
    private String hobbies;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}
