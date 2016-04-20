package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.dao.IConseillerDao;
import com.adaming.banque.entities.ConseillerClientele;

public class ConseillerServiceImpl implements IConseillerService {
	
	private IConseillerDao conseillerDao;

	public void setConseillerDao(IConseillerDao conseillerDao) {
		this.conseillerDao = conseillerDao;
	}

	public void ajouterConseiller(ConseillerClientele conseiller) {
		conseillerDao.saveConseiller(conseiller);
		
	}

	public void updateConseiller(ConseillerClientele conseiller) {
		conseillerDao.updateConseiller(conseiller);
		
	}

	public void supprimerConseiller(ConseillerClientele conseiller) {
		conseillerDao.deleteConseiller(conseiller);
		
	}

	public ConseillerClientele getConseillerById(int id) {
		return conseillerDao.getConseillerById(id);
	}

	public List<ConseillerClientele> getAllConseiller() {
		return conseillerDao.getAllConseiller();
	}
	
	

}
