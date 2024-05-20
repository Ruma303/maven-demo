package com.example.springapp;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HelloServiceTime implements IHelloService {
    final private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private String generateTimeInfo() {
        return formatter.format(LocalTime.now());
    }

    @Override
    public String getHello() {
        return "Hello, World! Time: " + generateTimeInfo();
    }
}
