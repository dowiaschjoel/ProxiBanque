package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.dao.IAgenceDao;
import com.adaming.banque.entities.Agence;

public class AgenceServiceImpl implements IAgenceService{
	
	private IAgenceDao agenceDao;

	public void setAgenceDao(IAgenceDao agenceDao) {
		this.agenceDao = agenceDao;
	}

	public void ajouterAgence(Agence agence) {
		agenceDao.saveAgence(agence);
		
	}

	public void updateAgence(Agence agence) {
		agenceDao.updateAgence(agence);
		
	}

	public void supprimerAgence(Agence agence) {
		agenceDao.deleteAgence(agence);
		
	}

	public Agence getAgenceById(int id) {
		return agenceDao.getAgenceById(id);
	}

	public List<Agence> getAllAgence() {
		return agenceDao.getAllAgence();
	}

}
