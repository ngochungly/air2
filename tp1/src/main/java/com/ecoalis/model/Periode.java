package com.ecoalis.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Periode {
	private String dateDebut;
	private int nbJours;
	
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	public String getDateDebut() {
		return this.dateDebut;
	}
	
	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}
	
	public int getNbJours() {
		return this.nbJours;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
