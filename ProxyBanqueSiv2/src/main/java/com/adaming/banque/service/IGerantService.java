package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.entities.Gerant;

public interface IGerantService {
	
	void ajouterGerant(Gerant gerant);
	void updateGerant(Gerant gerant);
	void supprimerGerant (Gerant gerant);
	Gerant getGerantById(int id);
	List<Gerant> getAllGerant();

}
