package com.stepinfo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoader;

import com.stepinfo.model.DemandeConge;
import com.stepinfo.service.DemandeCongeServiceMock;

@Controller
public class DirectionController {
	@RequestMapping("/direction")
	public String detailDdc_direction(@RequestParam("ddcId") int id, Model model) {
		ApplicationContext ctx = (ApplicationContext) ContextLoader.getCurrentWebApplicationContext();
		DemandeCongeServiceMock demandeCongeService = (DemandeCongeServiceMock) ctx.getBean("demandeCongeService");
		DemandeConge ddc = demandeCongeService.getDemandeConge(id);
		model.addAttribute("demandeConge", ddc);
		model.addAttribute("message", "Vous êtes authentifié pour voir cette page!");
		return "detailDdc";
	}
}
