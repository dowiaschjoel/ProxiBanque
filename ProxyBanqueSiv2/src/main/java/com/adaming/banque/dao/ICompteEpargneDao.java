package com.adaming.banque.dao;

import java.util.List;

import com.adaming.banque.entities.CompteEpargne;

public interface ICompteEpargneDao {

	void saveCompteEpargne(CompteEpargne compteEpargne);
	void updateCompteEpargne(CompteEpargne compteEpargne);
	void deleteCompteEpargne(int id);
	CompteEpargne getCompteEpargneById(int id);
	List<CompteEpargne> getAllCompteEpargne();
	
	float calculerInteret(int id);
	
}
