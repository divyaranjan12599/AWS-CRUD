package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}