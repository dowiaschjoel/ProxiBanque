package com.adaming.banque.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="gerant")
@Table(name="gerants")
public class Gerant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_gerant")
	private int idGerant;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="civilite")
	private String civilite;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gerant")
	private List<ConseillerClientele> listeConseillers;

	public Gerant() {
		super();
	}

	public Gerant(String nom, String prenom, String civilite, List<ConseillerClientele> listeConseillers) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.listeConseillers = listeConseillers;
	}

	public Gerant(int idGerant, String nom, String prenom, String civilite) {
		super();
		this.idGerant = idGerant;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
	}

	public Gerant(int idGerant, String nom, String prenom, String civilite,
			List<ConseillerClientele> listeConseillers) {
		super();
		this.idGerant = idGerant;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.listeConseillers = listeConseillers;
	}

	public int getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(int idGerant) {
		this.idGerant = idGerant;
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

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public List<ConseillerClientele> getListeConseillers() {
		return listeConseillers;
	}

	public void setListeConseillers(List<ConseillerClientele> listeConseillers) {
		this.listeConseillers = listeConseillers;
	}
	
}
