package com.example.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class MyController {
    @Value("#{environment.EXAMPLE_NAME}")
    String name;
    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home(Model model) {

        var words = List.of("mountain", "noon", "rock", "river", "spring", name+" aa");

        model.addAttribute("words", words);

        return "index";
    }
}