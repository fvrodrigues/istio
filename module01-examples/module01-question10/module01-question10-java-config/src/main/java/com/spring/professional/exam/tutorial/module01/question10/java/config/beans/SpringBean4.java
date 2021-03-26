package com.spring.professional.exam.tutorial.module01.question10.java.config.beans;

import org.springframework.stereotype.Component;

@Component
public class SpringBean4 {
    public SpringBean4() {
        System.out.println(getClass().getSimpleName() + "::constructor");
    }
  public void sayHello() {
        System.out.println("Hello");
    }}
