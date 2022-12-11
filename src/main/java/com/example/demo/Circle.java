package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
public class Circle {
    private double radius;

    @PostConstruct
    public void postConstruct(){
        System.out.println("Circle post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Circle pre destroy");
    }
}
