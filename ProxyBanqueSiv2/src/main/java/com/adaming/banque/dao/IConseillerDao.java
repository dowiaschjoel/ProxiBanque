package com.adaming.banque.dao;

import java.util.List;

import com.adaming.banque.entities.ConseillerClientele;

public interface IConseillerDao {
	
	void saveConseiller(ConseillerClientele conseiller);
	void updateConseiller(ConseillerClientele conseiller);
	void deleteConseiller(ConseillerClientele conseiller);
	ConseillerClientele getConseillerById (int id);
	List<ConseillerClientele> getAllConseiller();

}
