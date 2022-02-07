package com.stepinfo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stepinfo.model.DemandeConge;
import com.stepinfo.model.TypeDdc;
import com.stepinfo.validator.DemandeCongeValidator;

@Controller
@RequestMapping("/creerDdc")
public class CreerDdcController {

	@ModelAttribute("typeDdc")
	public TypeDdc[] populateTypeDdc() {
		return TypeDdc.values();
	}
	
	@ModelAttribute("demandeConge")
	public DemandeConge getDdc() {
		return new DemandeConge();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		   model.addAttribute("now", new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
	    return "creerDdc";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(@ModelAttribute DemandeConge dc, BindingResult result, Model model) {
		System.out.println(dc.getCollaborateur());
		System.out.println(dc.getPeriode());
		System.out.println(dc.getType());
		
		(new DemandeCongeValidator()).validate(dc, result);
		
		if (result.hasErrors()) {
			List<FieldError> fieldErrList = result.getFieldErrors();
			for (FieldError e : fieldErrList) {
				System.out.println("FieldError: " + e.getField() + ", errorCode: " + e.getCode());
				
				switch (e.getCode()) {
				case "collaborateur.nom.empty":
				case "collaborateur.prenom.empty":
				case "periode.dateDebut.empty":
				case "periode.nbJours.empty":
					model.addAttribute("errorMessage", "Tous les champs sont obligatoires.");
					break;
				case "periode.nbJours.nonPositif":
					model.addAttribute("errorMessage", "Le nombre de jours est positif.");
					break;
				default:
					model.addAttribute("errorMessage", "Il y a erreur!");
				}
			}
		} else {
			model.addAttribute("infoMessage", "Saisie de données réussie.");
		}
		
		return "creerDdc";
	}

}
