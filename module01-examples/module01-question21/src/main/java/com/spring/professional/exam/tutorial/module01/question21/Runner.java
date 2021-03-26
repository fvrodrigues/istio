package com.spring.professional.exam.tutorial.module01.question21;

import com.spring.professional.exam.tutorial.module01.question21.beans.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question21.beans.SpringBean10;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        context.registerShutdownHook();

        SpringBean10 springBean1 = context.getBean(SpringBean10.class);
        System.out.println(springBean1);

        SpringBean10 springBean2= context.getBean(SpringBean10.class);
        System.out.println(springBean2);

        //   springBean1.printDependencies();
    }
}
