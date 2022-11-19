package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    @Value("${env.EXAMPLE_NAME}")
    String name;

    @GetMapping(value = "/test", produces = MediaType.TEXT_HTML_VALUE)
    public String home(Model model) {
        return "hello spring-mvc " + name;
    }
}