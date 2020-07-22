package com.java1910.springboot;

import com.java1910.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Autowired
    Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
