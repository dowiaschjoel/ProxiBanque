package com.adaming.banque.entities;

import java.io.Serializable;

public class Particulier extends Client implements Serializable{

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
