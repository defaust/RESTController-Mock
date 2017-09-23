package ua.com.fdi.demo.controller;

import ua.com.fdi.demo.entities.UserInfo;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/")
public class UserController {
    @GetMapping(value = "/vlad", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody UserInfo getSome(){
        return UserInfo.builder()
                .name("Vlad")
                .email("vlad@vladCorparation.com")
                .bank_account(999999999)
                .sex("male")
                .build();
    }

//    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody String home() {
//        String username = SecurityContextHolder.getContext().getAuthentication().getName();
//        return "Welcome, " + username;
//    }
}
