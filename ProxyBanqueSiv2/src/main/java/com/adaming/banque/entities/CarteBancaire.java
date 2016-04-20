package com.adaming.banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name="CarteBancaire")
@Table(name="cartesBancaires")
@Inheritance( strategy = InheritanceType.JOINED )
public class CarteBancaire{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="numero_carte")
	private int numeroCarte;
	
	@Column(name="date_validite")
	private String dateValidite;
	
	@Column(name="pictogramme")
	private int pictogramme;
	
	@Column(name="carte_active")
	private Boolean carteActive;

	public CarteBancaire() {
		super();
	}

	public CarteBancaire(String dateValidite, int pictogramme, Boolean carteActive) {
		super();
		this.dateValidite = dateValidite;
		this.pictogramme = pictogramme;
		this.carteActive = carteActive;
	}

	public CarteBancaire(int numeroCarte, String dateValidite, int pictogramme, Boolean carteActive) {
		super();
		this.numeroCarte = numeroCarte;
		this.dateValidite = dateValidite;
		this.pictogramme = pictogramme;
		this.carteActive = carteActive;
	}

	public int getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public String getDateValidite() {
		return dateValidite;
	}

	public void setDateValidite(String dateValidite) {
		this.dateValidite = dateValidite;
	}

	public int getPictogramme() {
		return pictogramme;
	}

	public void setPictogramme(int pictogramme) {
		this.pictogramme = pictogramme;
	}

	public Boolean getCarteActive() {
		return carteActive;
	}

	public void setCarteActive(Boolean carteActive) {
		this.carteActive = carteActive;
	}
	
	
}
