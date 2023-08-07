package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("CAR")
public class Bike implements Vehicle {
    @Bean(name = "drive")
    public void drive() {
        System.out.println("bike");
    }
}
