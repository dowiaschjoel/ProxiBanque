package com.adaming.banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name="compteBancaire")
@Table(name="comptesBancaires")
@Inheritance( strategy = InheritanceType.JOINED )
public class CompteBancaire {
	
	@Id
	@Column(name="id_compte_bancaire")
	private String idCompteBancaire;
	
	@Column(name="date_ouverture_compte")
	private String dateOuverture;
	
	@Column(name="solde_compte")
	private float solde;

	public CompteBancaire() {
		super();
	}

	public CompteBancaire(String dateOuverture, float solde) {
		super();
		this.dateOuverture = dateOuverture;
		this.solde = solde;
	}

	public CompteBancaire(String idCompteBancaire, String dateOuverture, float solde) {
		super();
		this.idCompteBancaire = idCompteBancaire;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
	}

	public String getIdCompteBancaire() {
		return idCompteBancaire;
	}

	public void setIdCompteBancaire(String idCompteBancaire) {
		this.idCompteBancaire = idCompteBancaire;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	
}
