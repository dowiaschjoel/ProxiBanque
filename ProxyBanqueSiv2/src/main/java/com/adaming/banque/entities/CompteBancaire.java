package com.adaming.banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="compteBancaire")
@Table(name="comptesBancaires")
public class CompteBancaire {
	
	@Id
	@Column(name="id_compte_bancaire")
	private String idCompteBancaire;
	
	@Column(name="date_ouverture_compte")
	private String dateOuverture;
	
	@Column(name="solde_compte")
	private float solde;
	
	@Column(name="client_compte")
	private Client clientCompte;
	
	@Column(name="decouvert_compte_courant")
	private int decouvert;
	
	@Column(name="carte_compte_courant")
	private String carte;
	
	@Column(name="taux_compte_epargne")
	private float taux;

	public CompteBancaire() {
		super();
	}

	public CompteBancaire(String dateOuverture, float solde, Client clientCompte, int decouvert, String carte) {
		super();
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.clientCompte = clientCompte;
		this.decouvert = decouvert;
		this.carte = carte;
	}

	

	public CompteBancaire(String idCompteBancaire, String dateOuverture, float solde, Client clientCompte, float taux) {
		super();
		this.idCompteBancaire = idCompteBancaire;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.clientCompte = clientCompte;
		this.taux = taux;
	}

	public CompteBancaire(String idCompteBancaire, String dateOuverture, float solde, Client clientCompte,
			int decouvert, String carte) {
		super();
		this.idCompteBancaire = idCompteBancaire;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.clientCompte = clientCompte;
		this.decouvert = decouvert;
		this.carte = carte;
	}

	public CompteBancaire(String dateOuverture, float solde, Client clientCompte, float taux) {
		super();
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.clientCompte = clientCompte;
		this.taux = taux;
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

	public Client getClientCompte() {
		return clientCompte;
	}

	public void setClientCompte(Client clientCompte) {
		this.clientCompte = clientCompte;
	}
}
