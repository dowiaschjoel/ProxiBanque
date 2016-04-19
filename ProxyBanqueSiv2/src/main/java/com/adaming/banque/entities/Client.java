package com.adaming.banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="client")
@Table(name="clients")
public class Client {

	@Id
	@Column(name="id_client")
	private int id;
	
	@Column(name="nom_client")
	private String nom;
	
	@Column(name="prenom_client")
	private String prenom;
	
	@Column(name="adresse_client")
	private String adresse;
	
	@Column(name="code_postal_client")
	private int codePostal;
	
	@Column(name="ville_client")
	private String ville;
	
	@Column(name="telephone_client")
	private int telephone;
	
	@Column(name="cc_client")
	private CompteCourant cc;
	
	@Column(name="ce_client")
	private CompteEpargne ce;
	
	

	public Client() {
		super();
	}


	public Client(String nom, String prenom, String adresse, int codePostal, String ville, int telephone,
			CompteCourant cc, CompteEpargne ce) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.cc = cc;
		this.ce = ce;
	}



	public Client(int id, String nom, String prenom, String adresse, int codePostal, String ville, int telephone,
			CompteCourant cc, CompteEpargne ce) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.cc = cc;
		this.ce = ce;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public int getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public int getTelephone() {
		return telephone;
	}


	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}


	public CompteCourant getCc() {
		return cc;
	}


	public void setCc(CompteCourant cc) {
		this.cc = cc;
	}


	public CompteEpargne getCe() {
		return ce;
	}


	public void setCe(CompteEpargne ce) {
		this.ce = ce;
	}
	
}
