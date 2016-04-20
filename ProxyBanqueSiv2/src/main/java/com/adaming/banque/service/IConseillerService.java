package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.entities.ConseillerClientele;

public interface IConseillerService {
	
	void ajouterConseiller(ConseillerClientele conseiller);
	void updateConseiller(ConseillerClientele conseiller);
	void supprimerConseiller (ConseillerClientele conseiller);
	ConseillerClientele getConseillerById(int id);
	List<ConseillerClientele> getAllConseiller();

}
