package com.baitap.controller;

import com.baitap.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @GetMapping("/users")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "/index";
    }

    @PostMapping("/submitForm")
    public String submitForm(@Valid @ModelAttribute("user")  User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/index";
        }
        model.addAttribute("user", user);
        return "/results";
    }
}

