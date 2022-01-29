package com.ecoalis.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class DemandeConge {
	private Collaborateur collaborateur;
	private Periode periode;
	
	public void setCollaborateur(Collaborateur collaborateur) {
		this.collaborateur = collaborateur;
	}
	
	public Collaborateur getCollaborateur() {
		return this.collaborateur;
	}
	
	public void setPeriode(Periode periode) {
		this.periode = periode;
	}
	
	public Periode getPeriode() {
		return this.periode;
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
