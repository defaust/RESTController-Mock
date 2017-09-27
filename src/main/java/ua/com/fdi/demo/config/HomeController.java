package ua.com.fdi.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ua.com.fdi.demo.security.OpenIdConnectUserDetails;

@RestController
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping(value = "/user")
    @ResponseBody
    public final String home() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        OpenIdConnectUserDetails user = (OpenIdConnectUserDetails) auth.getPrincipal();

        System.out.println("#############" + user.getUserId());
        //System.out.println("#############" + user.getPassword());
        //final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        //logger.info(username);
        return "Welcome, " + user.getUserId();
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
