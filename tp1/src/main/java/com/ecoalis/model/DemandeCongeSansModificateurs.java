package com.ecoalis.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class DemandeCongeSansModificateurs {
	private Collaborateur collaborateur;
	private Periode periode;
	
	public DemandeCongeSansModificateurs(Collaborateur collaborateur, Periode periode) {
		this.collaborateur = collaborateur;
		this.periode = periode;
	}
	
	public void print() {
		String text1 = "Collaborateur: " + ToStringBuilder.reflectionToString(this.collaborateur);
		String text2 = "Periode: " + ToStringBuilder.reflectionToString(this.periode);
		System.out.println();
		System.out.println(text1);
		System.out.println(text2);
		System.out.println();
	}
}
