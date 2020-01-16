package com.calc.SpringAppCalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Hello {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calculation")
    public String calculate(@RequestParam("express") String temp, Model model) {
        String calculation = Calculator.calculate(temp);
        model.addAttribute("express", calculation);
        return "calculation";
    }

}
