package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class pagecontroller {


  @GetMapping("/")
    public String index() {
        return "1";
    }
  @PostMapping("/submit")
  public String submit(@RequestParam("username") String username, Model model) {
        model.addAttribute("username", username);
        return "2";
  }

}
