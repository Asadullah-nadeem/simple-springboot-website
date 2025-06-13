package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class pagecontroller {

  private String username;
  private String firstName;
  private String lastName;

  public String getUsername() { return username; }
  public void setUsername(String username) { this.username = username; }

  public String getFirstName() { return firstName; }
  public void setFirstName(String firstName) { this.firstName = firstName; }

  public String getLastName() { return lastName; }
  public void setLastName(String lastName) { this.lastName = lastName; }



  // public String submit(
  // @RequestParam("username") String username,
  // @RequestParam("firstName") String firstName,
  // @RequestParam("lastName") String lastName,
  // Model model) {

  //   model.addAttribute("username", username);
  //   model.addAttribute("firstName", firstName);
  //   model.addAttribute("lastName", lastName);

  //   return "2";
  // }


  @GetMapping("/")
    public String index() {
        return "1";
    }
  // @PostMapping("/submit")
  // public String submit(@RequestParam("username") String username, Model model) {
  //       model.addAttribute("username", username);
  //       return "2";
  // }
  // public String submit(@ModelAttribute pagecontroller user, Model model) {
  //   model.addAttribute("pagecontroller", user);
  //   return "2";
  // }
  @PostMapping("/submit")
  public String submit(@ModelAttribute("user") pagecontroller user, Model model) {
        model.addAttribute("username", user.getUsername());
        model.addAttribute("firstName", user.getFirstName());
        model.addAttribute("lastName", user.getLastName());
        return "2";
  }

}

