package com.adaming.banque.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="compteCourant")
@Table(name="comptesCourants")
public class CompteCourant extends CompteBancaire{

	private int decouvert;
	
	private String carte;
	
	@Id
	@JoinColumn(name="client_id", referencedColumnName = "id_client")
	@OneToOne(mappedBy="cc")
	private Client clientCompte;

	public CompteCourant() {
		super();
	}

	public CompteCourant(int decouvert, String carte, Client clientCompte) {
		super();
		this.decouvert = decouvert;
		this.carte = carte;
		this.clientCompte = clientCompte;
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

	public Client getClientCompte() {
		return clientCompte;
	}

	public void setClientCompte(Client clientCompte) {
		this.clientCompte = clientCompte;
	}
	
	
}
