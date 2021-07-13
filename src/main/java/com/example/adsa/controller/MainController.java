package com.example.adsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getPage(){

        return "main";
    }

    @GetMapping("/first")
    public String getPageFirst(){
        return "first";
    }



}
