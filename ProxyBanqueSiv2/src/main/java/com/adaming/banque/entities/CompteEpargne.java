package com.adaming.banque.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="compteEpargne")
//@Table(name="comptesEpargnes")
public class CompteEpargne extends CompteBancaire {

	private float taux;
	
	@JoinColumn(name="client_id", referencedColumnName = "id_client")
	@OneToOne(mappedBy="ce")
	private Client clientCompte;
}
