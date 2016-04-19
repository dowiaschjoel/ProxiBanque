package com.adaming.banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="CarteBancaire")
@Table(name="cartesBancaires")
public class CarteBancaire {

	@Id
	@Column(name="numero_carte")
	private int numeroCarte;
	
	@Column(name="date_validite")
	private String dateValidite;
	
	@Column(name="pictogramme")
	private int pictogramme;
	
	@Column(name="carte_active")
	private Boolean carteActive;
}
