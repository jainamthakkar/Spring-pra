package com.example.DependencyInjection_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Employee employee1 = (Employee) context.getBean("employee1");
//        Employee employee2 = (Employee) context.getBean("employee2");

        System.out.println(employee1);
//        System.out.println(employee2);
    }
}
