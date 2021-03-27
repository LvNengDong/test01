package com.example.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class BlogProperties {

    @Value("${cn.xsyu.blog.name}")
    private String name;

    @Value("${cn.xsyu.blog.context}")
    private String properties;

    @Value("${cn.xsyu.blog.randomValue}")
    private String randomValue;

    @Value("${cn.xsyu.blog.randomInt}")
    private String randomInt;

    @Value("${cn.xsyu.blog.randomInt2}")
    private String randomInt2;

    @Value("${cn.xsyu.blog.randomInt3}")
    private String randomInt3;

    @Value("${cn.xsyu.blog.randomLong}")
    private String randomLong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(String randomValue) {
        this.randomValue = randomValue;
    }

    public String getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(String randomInt) {
        this.randomInt = randomInt;
    }

    public String getRandomInt2() {
        return randomInt2;
    }

    public void setRandomInt2(String randomInt2) {
        this.randomInt2 = randomInt2;
    }

    public String getRandomInt3() {
        return randomInt3;
    }

    public void setRandomInt3(String randomInt3) {
        this.randomInt3 = randomInt3;
    }

    public String getRandomLong() {
        return randomLong;
    }

    public void setRandomLong(String randomLong) {
        this.randomLong = randomLong;
    }
}
