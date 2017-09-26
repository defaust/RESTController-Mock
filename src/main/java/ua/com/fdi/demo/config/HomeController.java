package ua.com.fdi.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/")
    @ResponseBody
    public final String home() {
        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        logger.info(username);
        return "Welcome, " + username;
    }

    @GetMapping(value = "/vlad", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody UserInfo getSome(){
                return UserInfo.builder()
                                .name("Vlad")
                                .email("vlad@vladCorparation.com")
                                .bank_account(999999999)
                                .sex("male")
                                .build();
            }
}
