package com.adaming.banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="client")
@Table(name="clients")
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private int id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="code_postal")
	private int codePostal;
	
	@Column(name="ville")
	private String ville;
	
	@Column(name="telephone")
	private int telephone;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clients_id_conseiller")
	private ConseillerClientele conseiller;
	
	@OneToOne
	@JoinColumn(name="client_ccId", referencedColumnName="id_compte_bancaire")
	private CompteCourant cc;
	
	@OneToOne
	@JoinColumn(name="client_ceId", referencedColumnName="id_compte_bancaire")
	private CompteEpargne ce;

	public Client() {
		super();
	}

	public Client(String nom, String prenom, String adresse, int codePostal, String ville, int telephone,
			ConseillerClientele conseiller, CompteCourant cc, CompteEpargne ce) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.conseiller = conseiller;
		this.cc = cc;
		this.ce = ce;
	}

	public Client(int id, String nom, String prenom, String adresse, int codePostal, String ville, int telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
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

	public ConseillerClientele getConseiller() {
		return conseiller;
	}

	public void setConseiller(ConseillerClientele conseiller) {
		this.conseiller = conseiller;
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
