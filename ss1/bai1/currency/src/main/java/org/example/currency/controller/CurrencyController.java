package org.example.currency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {

    @GetMapping("/")
    public String home() {
        System.out.println("Controller Home");
        return "home";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam("usd") double usd, @RequestParam("rate") double rate, Model model) {
        double vnd = usd * rate;

        model.addAttribute("usd", usd);
        model.addAttribute("rate", rate);
        model.addAttribute("vnd", vnd);
        return "result";
    }
}
