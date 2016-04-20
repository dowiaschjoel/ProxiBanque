package com.adaming.banque.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="compteCourant")
//@Table(name="comptesCourants")
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
