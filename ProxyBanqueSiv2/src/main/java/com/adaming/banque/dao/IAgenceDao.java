package com.adaming.banque.dao;

import java.util.List;

import com.adaming.banque.entities.Agence;

public interface IAgenceDao {
	
	void saveAgence(Agence agence);
	void updateAgence(Agence agence);
	void deleteAgence(Agence agence);
	Agence getAgenceById (int id);
	List<Agence> getAllAgence();

}
