package com.adaming.banque.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="compteCourant")
@Table(name="comptesCourants")
public class CompteCourant extends CompteBancaire{

	private int decouvert;
	
	private String carte;
	
	@JoinColumn(name="client_id", referencedColumnName = "id_client")
	@OneToOne(mappedBy="cc")
	private Client clientCompte;
	
}
