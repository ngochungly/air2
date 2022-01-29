package com.ecoalis.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DemandeCongeSansModificateurs {

   private Collaborateur collaborateur;
   private Periode periode;

   @Autowired(required = true)
   public DemandeCongeSansModificateurs(Collaborateur collaborateur, Periode periode) {
      this.collaborateur = collaborateur;
      this.periode = periode;
   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }
}
