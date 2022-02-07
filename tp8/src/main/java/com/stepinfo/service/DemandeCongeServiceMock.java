package com.stepinfo.service;

import javax.annotation.security.RolesAllowed;

import com.stepinfo.model.Collaborateur;
import com.stepinfo.model.DemandeConge;
import com.stepinfo.model.Periode;


public class DemandeCongeServiceMock {

	@RolesAllowed("ROLE_DIRECTION")
   public DemandeConge getDemandeConge(int ddcId) {
      Collaborateur collaborateur = new Collaborateur("Doe", "John");
      Periode periode = new Periode((int) (Math.random() * 30 + 1) + "/02/2022", (int) (Math.random() * 5 + 1));
      DemandeConge demandeConge = new DemandeConge(collaborateur, periode, ddcId * 17);

      return demandeConge;
   }
}
