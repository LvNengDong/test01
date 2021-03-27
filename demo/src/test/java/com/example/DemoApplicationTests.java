package com.example;

import com.example.config.BlogProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private BlogProperties blogProperties;

    @Test
    void contextLoads() {
        String name = blogProperties.getName();
        String properties = blogProperties.getProperties();
//        System.out.println(name+properties);
        System.out.println(blogProperties.getRandomValue());
        System.out.println(blogProperties.getRandomInt());
        System.out.println(blogProperties.getRandomInt2());
        System.out.println(blogProperties.getRandomInt3());
        System.out.println(blogProperties.getRandomLong());
    }

}
