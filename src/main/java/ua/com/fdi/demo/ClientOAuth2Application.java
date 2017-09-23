package ua.com.fdi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"ua.com.fdi.demo.controller", "ua.com.fdi.demo.config"})
public class ClientOAuth2Application {
    public static void main(String[] args) {
        SpringApplication.run(ClientOAuth2Application.class, args);
    }
}