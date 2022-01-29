package com.ecoalis.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DemandeConge {

   private Collaborateur collaborateur;
   private Periode periode;

   public Collaborateur getCollaborateur() {
      return collaborateur;
   }

   @Autowired(required = true)
   public void setCollaborateur(Collaborateur collaborateur) {
      this.collaborateur = collaborateur;
   }

   public Periode getPeriode() {
      return periode;
   }

   @Autowired(required = true)
   public void setPeriode(Periode periode) {
      this.periode = periode;
   }
   
   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }

}
