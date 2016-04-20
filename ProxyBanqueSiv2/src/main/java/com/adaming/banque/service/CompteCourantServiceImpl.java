package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.dao.ICompteCourantDao;
import com.adaming.banque.entities.CompteCourant;

public class CompteCourantServiceImpl implements ICompteCourantService {
	
	private ICompteCourantDao compteCourantDao;

	public void setCompteCourantDao(ICompteCourantDao compteCourantDao) {
		this.compteCourantDao = compteCourantDao;
	}

	public void saveCompteCourant(CompteCourant compteCourant) {
		compteCourantDao.saveCompteCourant(compteCourant);

	}

	public void updateCompteCourant(CompteCourant compteCourant) {
		compteCourantDao.updateCompteCourant(compteCourant);

	}

	public void deleteCompteCourant(int id) {
		compteCourantDao.deleteCompteCourant(id);

	}

	public CompteCourant getCompteCourantById(int id) {
		return compteCourantDao.getCompteCourantById(id);
	}

	public List<CompteCourant> getAllCompteCourant() {
		return compteCourantDao.getAllCompteCourant();
	}

}
