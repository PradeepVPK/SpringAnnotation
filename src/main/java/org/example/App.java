package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
 ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);


        // Getting the Bean from the component class
//        Vehicle v = (Vehicle) context.getBean("bikebean");
//        v.drive();

        context.getBean("drive");


    /*    Vehicle v= (Vehicle) context.getBean("bike");
        v.drive();*/
    }
}
