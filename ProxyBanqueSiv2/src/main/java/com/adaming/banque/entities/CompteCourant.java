package com.adaming.banque.entities;


public class CompteCourant extends CompteBancaire {
	
	private int decouvert;
	
	private String carte;

	public CompteCourant(int decouvert, String carte) {
		super();
		this.decouvert = decouvert;
		this.carte = carte;
	}

	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	public String getCarte() {
		return carte;
	}

	public void setCarte(String carte) {
		this.carte = carte;
	}
	
	
}
