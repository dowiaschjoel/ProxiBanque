package com.adaming.banque.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="compteEpargne")
//@Table(name="comptesEpargnes")
public class CompteEpargne extends CompteBancaire implements Serializable{
	
	private float taux;
	
}
