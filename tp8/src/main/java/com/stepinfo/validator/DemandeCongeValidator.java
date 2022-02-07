package com.stepinfo.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.stepinfo.model.DemandeConge;

public class DemandeCongeValidator implements Validator {
	
	public boolean supports(Class aClass) {
		return DemandeConge.class.isAssignableFrom(aClass);
	}
	
	public void validate(Object obj, Errors e) {
		
		ValidationUtils.rejectIfEmpty(e, "collaborateur.nom", "collaborateur.nom.empty");
		ValidationUtils.rejectIfEmpty(e, "collaborateur.prenom", "collaborateur.prenom.empty");
		ValidationUtils.rejectIfEmpty(e, "periode.dateDebut", "periode.dateDebut.empty");
		ValidationUtils.rejectIfEmpty(e, "periode.nbJours", "periode.nbJours.empty");
		DemandeConge p = (DemandeConge) obj;
		
		if (p.getPeriode().getNbJours() <= 0) {
			e.rejectValue("periode.nbJours", "periode.nbJours.nonPositif");
		}
		
	}
}
