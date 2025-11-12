package com.webcam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebcamController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
} 