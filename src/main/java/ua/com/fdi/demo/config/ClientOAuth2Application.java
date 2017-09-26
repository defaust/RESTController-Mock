package ua.com.fdi.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(value = {"ua.com.fdi.demo.controller"})
public class ClientOAuth2Application {
    public static void main(String[] args) {
        SpringApplication.run(ClientOAuth2Application.class, args);
    }
}