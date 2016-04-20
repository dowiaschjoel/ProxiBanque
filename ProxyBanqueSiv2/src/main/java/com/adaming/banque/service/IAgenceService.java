package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.entities.Agence;

public interface IAgenceService {
	
	void ajouterAgence(Agence agence);
	void updateAgence(Agence agence);
	void supprimerAgence (Agence agence);
	Agence getAgenceById(int id);
	List<Agence> getAllAgence();

}
