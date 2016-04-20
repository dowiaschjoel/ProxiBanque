package com.adaming.banque.dao;

import java.util.List;

import com.adaming.banque.entities.CompteCourant;

public interface ICompteCourantDao {

	void saveCompteCourant(CompteCourant compteCourant);
	void updateCompteCourant(CompteCourant compteCourant);
	void deleteCompteCourant(int id);
	CompteCourant getCompteCourantById(int id);
	List<CompteCourant> getAllCompteCourant();
	
}
