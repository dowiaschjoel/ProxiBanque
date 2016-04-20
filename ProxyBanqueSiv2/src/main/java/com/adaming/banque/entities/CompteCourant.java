package com.adaming.banque.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="compteCourant")
@Table(name="comptesCourants")
public class CompteCourant extends CompteBancaire implements Serializable{
	
	private int decouvert;
	
	private String carte;
	
}
