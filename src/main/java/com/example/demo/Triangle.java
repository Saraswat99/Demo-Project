package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
public class Triangle {

    private String type;
    private int sides;
    private boolean y;

    public void draw(){
        System.out.println(getType() +" triangle having "+getSides() +" sides" +" "+ isY());
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Triangle post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Triangle pre destroy");
    }
}
