package ua.com.fdi.demo.entities;


import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

@Builder
@ToString
@Getter @Setter
@JsonRootName(value = "UserInfo")
public class UserInfo {
    private String name;
    private String email;
    private int bank_account;
    private String sex;
}
