package com.stepinfo.controller;

//import java.io.IOException;

//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

@Controller
public class HomeController {

//   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,
//            IOException {
//
//      response.getWriter().write("Ecriture directe dans HttpServletResponse");
//      return new ModelAndView("/WEB-INF/mes_pages/home.jsp");  
//   }
   @RequestMapping("/home")
   public String home() {
	   return "home";
   }
}
