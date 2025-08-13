package com.example.meu_primeiro_spring_boot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloController {
    @GetMapping("hello")
    public String get() {
        return "Olá, mundo! Bem-vindo ao Spring Boot";
    }
}
