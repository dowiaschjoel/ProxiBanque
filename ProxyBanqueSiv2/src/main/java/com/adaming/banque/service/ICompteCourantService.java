package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.entities.CompteCourant;

public interface ICompteCourantService {

	void saveCompteCourant(CompteCourant compteCourant);
	void updateCompteCourant(CompteCourant compteCourant);
	void deleteCompteCourant(int id);
	CompteCourant getCompteCourantById(int id);
	List<CompteCourant> getAllCompteCourant();
	
}
