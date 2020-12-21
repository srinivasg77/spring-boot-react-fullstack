package com.amigoscode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run( DemoApplication.class, args );

        printMessage( "Hello How are you" );
        printMessage( "I am fine" );

    }

    private static void printMessage(String message) {
        System.out.println( message );
    }
}
