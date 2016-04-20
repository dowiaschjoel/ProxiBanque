package com.adaming.banque.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="conseiller")
@Table(name="conseillers")
public class ConseillerClientele {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_conseiller")
	private int idConseiller;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="agence")
	private String agence;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "conseiller")
    private List<Client> clients ;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "conseillers_id_gerant")
	private Gerant gerant;

	public ConseillerClientele() {
		super();
	}

	public ConseillerClientele(String nom, String prenom, String agence, List<Client> clients, Gerant gerant) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
		this.clients = clients;
		this.gerant = gerant;
	}

	public ConseillerClientele(int idConseiller, String nom, String prenom, String agence) {
		super();
		this.idConseiller = idConseiller;
		this.nom = nom;
		this.prenom = prenom;
		this.agence = agence;
	}

	public int getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
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

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	
	
}
