package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.dao.IGerantDao;
import com.adaming.banque.entities.Gerant;

public class GerantServiceImpl implements IGerantService{
	
	private IGerantDao gerantDao;

	public void setGerantDao(IGerantDao gerantDao) {
		this.gerantDao = gerantDao;
	}

	public void ajouterGerant(Gerant gerant) {
		gerantDao.saveGerant(gerant);
		
	}

	public void updateGerant(Gerant gerant) {
		gerantDao.updateGerant(gerant);
		
	}

	public void supprimerGerant(Gerant gerant) {
		gerantDao.deleteGerant(gerant);
		
	}

	public Gerant getGerantById(int id) {
		return gerantDao.getGerantById(id);
	}

	public List<Gerant> getAllGerant() {
		return gerantDao.getAllGerant();
	}

}
