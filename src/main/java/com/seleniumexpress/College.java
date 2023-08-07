package com.seleniumexpress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Value("${college.name}")
    private String colegeName;
    @Autowired
    private Principal principal;
    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;


    /*  public College(Principal principal) {
            this.principal = principal;
        }
    */
    public void test(){
        principal.principalInfo();
        teacher.teach();
        System.out.println("I am "+colegeName);
        System.out.println("test success");
    }

}