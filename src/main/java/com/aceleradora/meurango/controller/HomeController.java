package com.aceleradora.meurango.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    private List<String> opcoes() {
        return Arrays.asList(
                "Sopa",
                "Massa com Galinha",
                "Galeto"
        );
    }

    @GetMapping("/")
    public String boasVindas(Model model) {
        model.addAttribute("opcoes", opcoes());

        return "boas-vindas";
    }
}
