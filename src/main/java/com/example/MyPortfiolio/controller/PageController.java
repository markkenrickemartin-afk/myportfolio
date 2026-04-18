package com.example.MyPortfiolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index"; // Looks for templates/index.html
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // Looks for templates/about.html
    }

    @GetMapping("/journey")
    public String journey() {
        return "journey"; // Looks for templates/journey.html
    }

    @GetMapping("/skills")
    public String skills() {
        return "skills"; // Looks for templates/skills.html
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "gallery"; // Looks for templates/gallery.html
    }
}