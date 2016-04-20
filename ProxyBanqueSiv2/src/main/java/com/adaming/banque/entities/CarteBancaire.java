package com.adaming.banque.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="CarteBancaire")
@Table(name="cartesBancaires")
public class CarteBancaire implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="numero_carte")
	private int numeroCarte;
	
	@Column(name="date_validite")
	private String dateValidite;
	
	@Column(name="pictogramme")
	private int pictogramme;
	
	@Column(name="carte_active")
	private Boolean carteActive;
}
