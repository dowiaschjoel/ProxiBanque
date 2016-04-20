package com.adaming.banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@JoinColumn(name="client_id", referencedColumnName = "id_client")
	@OneToOne
	private Client clientCompte;

	public CompteBancaire() {
		super();
	}

	public CompteBancaire(String dateOuverture, float solde, Client clientCompte) {
		super();
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.clientCompte = clientCompte;
	}

	

	public CompteBancaire(String idCompteBancaire, String dateOuverture, float solde, Client clientCompte) {
		super();
		this.idCompteBancaire = idCompteBancaire;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.clientCompte = clientCompte;
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
