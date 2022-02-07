package com.stepinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
   
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
   @RequestMapping("/login")
   public String login(@RequestParam(required = false) String message, final Model model) {
     if (message != null && !message.isEmpty()) {
       if (message.equals("logout")) {
         model.addAttribute("message", "Logout!");
       }
       if (message.equals("error")) {
         model.addAttribute("message", "Login Failed!");
       }
     }
     return "login";
   }
}
