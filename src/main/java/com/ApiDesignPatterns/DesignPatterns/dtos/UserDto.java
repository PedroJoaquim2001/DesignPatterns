package com.ApiDesignPatterns.DesignPatterns.dtos;

import com.ApiDesignPatterns.DesignPatterns.models.enums.AcessStatus;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserDto {
    @NotNull @Length(min = 1,max = 35)
    private String username;
    @NotNull
    private String email;
    @NotNull @Length(min = 1,max = 65)
    private String password;
    @NotNull
    private AcessStatus acessLevel = AcessStatus.LIMITED;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = new BCryptPasswordEncoder().encode(password);
    }

    public String getAcessLevel() {
        return acessLevel.toString();
    }

    public void setAcessLevel(AcessStatus acessLevel) {
        this.acessLevel = acessLevel;
    }
}
