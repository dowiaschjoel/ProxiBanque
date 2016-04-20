package com.adaming.banque.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="compteEpargne")
@Table(name="comptesEpargnes")
public class CompteEpargne extends CompteBancaire {

	private float taux;
	
	@Id
	@JoinColumn(name="client_id", referencedColumnName = "id_client")
	@OneToOne(mappedBy="ce")
	private Client clientCompte;

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(float taux, Client clientCompte) {
		super();
		this.taux = taux;
		this.clientCompte = clientCompte;
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	public Client getClientCompte() {
		return clientCompte;
	}

	public void setClientCompte(Client clientCompte) {
		this.clientCompte = clientCompte;
	}
	
	
}
