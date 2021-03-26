package com.spring.professional.exam.tutorial.module01.question10.java.config;

import com.spring.professional.exam.tutorial.module01.question10.java.config.beans.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question10.java.config.beans.SpringBean4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        context.registerShutdownHook();

        SpringBean4 springBean1 = context.getBean(SpringBean4.class);
        springBean1.sayHello();
    }
}
