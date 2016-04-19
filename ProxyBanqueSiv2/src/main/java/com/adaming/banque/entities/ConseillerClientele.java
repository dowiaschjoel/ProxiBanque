package com.adaming.banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="conseiller")
@Table(name="conseillers")
public class ConseillerClientele {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private String idConseiller;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="agence")
	private String agence;
	
	public ConseillerClientele(String idConseiller, String nom, String prenom,
			String agence) {
		super();
		this.idConseiller = idConseiller;
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
	}
	
	public ConseillerClientele(String nom, String prenom, String agence) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
	}
	
	public String getIdConseiller() {
		return idConseiller;
	}
	public void setIdConseiller(String idConseiller) {
		this.idConseiller = idConseiller;
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
	public String getAgence() {
		return agence;
	}
	public void setAgence(String agence) {
		this.agence = agence;
	}

}
