package com.example.attpontuada2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String mensagem() {
        return "Bem-Vindo";
    }

    @GetMapping("/dev")
    public String nomeDev() {
        return "Feito por: João Victor!";
    }
}
