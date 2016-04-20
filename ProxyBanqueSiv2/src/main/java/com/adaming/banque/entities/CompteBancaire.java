package com.adaming.banque.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="compteBancaire")
@Table(name="comptesBancaires")
public class CompteBancaire implements Serializable{
	
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

}
