package com.adaming.banque.service;

import java.util.List;

import com.adaming.banque.dao.ICompteEpargneDao;
import com.adaming.banque.entities.CompteEpargne;

public class CompteEpargneServiceImpl implements ICompteEpargneService {
	
	private ICompteEpargneDao compteEpargneDao;

	public void setCompteEpargneDao(ICompteEpargneDao compteEpargneDao) {
		this.compteEpargneDao = compteEpargneDao;
	}

	public void saveCompteEpargne(CompteEpargne compteEpargne) {
		compteEpargneDao.saveCompteEpargne(compteEpargne);

	}

	public void updateCompteEpargne(CompteEpargne compteEpargne) {
		compteEpargneDao.updateCompteEpargne(compteEpargne);

	}

	public void deleteCompteEpargne(int id) {
		compteEpargneDao.deleteCompteEpargne(id);

	}

	public CompteEpargne getCompteEpargneById(int id) {
		return compteEpargneDao.getCompteEpargneById(id);
	}

	public List<CompteEpargne> getAllCompteEpargne() {
		return compteEpargneDao.getAllCompteEpargne();
	}

	public float calculerInterets(int id) {
		return compteEpargneDao.calculerInteret(id);
	}

}
