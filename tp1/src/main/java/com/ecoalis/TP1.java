package com.ecoalis;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ecoalis.model.DemandeConge;
import com.ecoalis.model.DemandeCongeSansModificateurs;

public class TP1 {

   public TP1() {
   }

   private void go() {
	   BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
	   DemandeConge demandeConge = (DemandeConge) factory.getBean("demandeConge");
	   demandeConge.print();
	   
	   DemandeConge demandeConge2 = (DemandeConge) factory.getBean("demandeConge");
	   demandeConge2.print();
	   
	   DemandeCongeSansModificateurs demandeCongeSansModificateurs = (DemandeCongeSansModificateurs) factory.getBean("demandeCongeSansModificateurs");
	   demandeCongeSansModificateurs.print();
   }

   public static void main(String[] args) {
      new TP1().go();
   }
}
