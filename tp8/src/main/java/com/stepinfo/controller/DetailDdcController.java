package com.stepinfo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoader;

//import org.springframework.web.context.ContextLoader;
import com.stepinfo.model.DemandeConge;
import com.stepinfo.service.DemandeCongeServiceMock;
//import com.stepinfo.service.DemandeCongeServiceMock2;

@Controller
public class DetailDdcController {

	private DemandeCongeServiceMock demadeCongeService = new DemandeCongeServiceMock();
	//private DemandeCongeServiceMock2 demandeCongeService = new DemandeCongeServiceMock2();
	
   @RequestMapping("/detailDdc")
   public String detailDdc(@RequestParam("ddcId") int id, Model model) {
	   
	   //ApplicationContext ctx = (ApplicationContext) ContextLoader.getCurrentWebApplicationContext();
	   //demandeCongeService.setApplicationContext(ctx);
	   
	   //DemandeConge ddc = demandeCongeService.getDemandeCongeFromContext(id);
	   
	   DemandeConge ddc = this.demadeCongeService.getDemandeConge(id);
	   model.addAttribute("demandeConge", ddc);
	   return "detailDdc";
   }
}
