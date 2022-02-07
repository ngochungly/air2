package com.stepinfo.controller;

import java.util.Collection;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

   @RequestMapping("/home")
   public String home(Authentication authentication, final Model model) {
	   
	   if (!(authentication instanceof AnonymousAuthenticationToken)) {
		   UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		   Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
		   for (GrantedAuthority a : authorities) {
			   if (a.getAuthority().equals("ROLE_DIRECTION")) {
				   model.addAttribute("message_role", "Vous avez le rôle direction!");
				   break;
			   }
		   }
	   }
	   return "home";
   }

}
