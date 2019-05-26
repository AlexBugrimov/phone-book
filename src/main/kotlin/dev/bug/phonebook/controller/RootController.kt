package dev.bug.phonebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class RootController {

    @GetMapping("/")
    fun root() = "redirect:/swagger-ui.html"
}
