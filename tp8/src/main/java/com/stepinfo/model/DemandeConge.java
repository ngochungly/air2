package com.stepinfo.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DemandeConge {

   @Autowired
   private Collaborateur collaborateur;
   @Autowired
   private Periode periode;
   private int numero;
   private TypeDdc type;

   public DemandeConge(Collaborateur collaborateur, Periode periode, int numero) {
	  super();
      this.collaborateur = collaborateur;
      this.periode = periode;
      this.numero = numero;
   }
   
   // Utilisé pour TP5
   public DemandeConge() {
      this.collaborateur = new Collaborateur();
      this.periode = new Periode();
   }

   // Getter et Setter Collaborateur
   public Collaborateur getCollaborateur() {
      return collaborateur;
   }
   
   public void setCollaborateur(Collaborateur collaborateur) {
	   this.collaborateur = collaborateur;
   }

   // Getter et Setter Periode
   public Periode getPeriode() {
      return periode;
   }
   
   public void setPeriode(Periode periode) {
	  this.periode = periode;
   }

   // Getter et Setter Numero
   public int getNumero() {
      return numero;
   }

   public void setNumero(int numero) {
      this.numero = numero;
   }
   
   // Getter et Setter pour TypeDdc (TP5)
   public TypeDdc getType() {
      return type;
   }

   public void setType(TypeDdc type) {
      this.type = type;
   }
   
   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }

}
