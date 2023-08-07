package com.seleniumexpress;

import org.example.AnnotationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college =context.getBean("college",College.class);
        college.test();
        context.close();
    }
}
