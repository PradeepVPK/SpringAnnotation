package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bike")

public class Car implements  Vehicle {

    public void drive(){
        System.out.println("CAr");
    }
}
