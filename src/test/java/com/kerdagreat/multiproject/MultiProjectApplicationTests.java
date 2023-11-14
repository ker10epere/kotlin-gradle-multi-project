package com.kerdagreat.multiproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MultiProjectApplicationTests {

    @Test
    void contextLoads() {
        Person ker = new Person("Ker", 1);
        System.out.println(ker);
    }

}
