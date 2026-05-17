package com.sau.wfa25.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

     @GetMapping("")
    public String home() {
         return "home";
         
     }

    @GetMapping("/new")
    public String newHome() {
        return "home-new";
    }

    @GetMapping("/newest")
    public String newestHome() {
        return "home-newest";
    }
}
