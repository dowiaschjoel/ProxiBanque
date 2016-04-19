package com.adaming.banque.entities;


public class CompteEpargne extends CompteBancaire {
	
	private float taux;
	


	public CompteEpargne(float taux) {
		super();
		this.taux = taux;
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}	
}
