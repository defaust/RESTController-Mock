package ua.com.fdi.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Principal user(Principal principal) {
        return principal;
    }

    @GetMapping(value = "/vlad", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UserInfo getSome(){
                return UserInfo.builder()
                                .name("Vlad")
                                .email("vlad@vladCorparation.com")
                                .bank_account(999999999)
                                .sex("male")
                                .build();
            }
}
