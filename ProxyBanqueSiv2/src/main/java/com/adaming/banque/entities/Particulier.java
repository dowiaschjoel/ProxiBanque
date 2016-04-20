package com.adaming.banque.entities;

public class Particulier extends Client {

	private Boolean fortune;

	public Particulier(Boolean fortune) {
		super();
		this.fortune = fortune;
	}

	public Boolean getFortune() {
		return fortune;
	}

	public void setFortune(Boolean fortune) {
		this.fortune = fortune;
	}
	
	
}
