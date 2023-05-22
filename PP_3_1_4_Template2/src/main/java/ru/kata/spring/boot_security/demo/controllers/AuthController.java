package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.services.UsersService;

@Controller
public class AuthController {

    @GetMapping("/")
    public String getAuthenticated() {
        return "login";
    }
}
