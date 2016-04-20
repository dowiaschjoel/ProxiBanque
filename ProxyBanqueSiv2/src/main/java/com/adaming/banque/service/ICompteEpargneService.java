package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.entities.CompteEpargne;

public interface ICompteEpargneService {

	void saveCompteEpargne(CompteEpargne compteEpargne);
	void updateCompteEpargne(CompteEpargne compteEpargne);
	void deleteCompteEpargne(int id);
	CompteEpargne getCompteEpargneById(int id);
	List<CompteEpargne> getAllCompteEpargne();
	
	float calculerInterets(int id);
}
