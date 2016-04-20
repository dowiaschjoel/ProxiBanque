package com.adaming.banque.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.banque.entities.CompteEpargne;

@Repository("ICompteEpargneDao")
@Transactional
public class CompteEpargneDaoImpl implements ICompteEpargneDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}	
	
	public void saveCompteEpargne(CompteEpargne compteEpargne) {
		getSession().save(compteEpargne);

	}

	public void updateCompteEpargne(CompteEpargne compteEpargne) {
		getSession().update(compteEpargne);

	}

	@SuppressWarnings("unchecked")
	public void deleteCompteEpargne(int id) {
		String reqHQLGetById = "FROM comptesEpargnes WHERE id_compte_bancaire = ?";
		List<CompteEpargne> result = (List<CompteEpargne>) getSession().createQuery(reqHQLGetById);
		result.get(0);  
	    getSession().delete(result);  
	}

	@SuppressWarnings("unchecked")
	public CompteEpargne getCompteEpargneById(int id) {
		String reqHQLGetById = "FROM comptesEpargnes WHERE id_compte_bancaire = ?";

		List<CompteEpargne> compteEpargneListe = (List<CompteEpargne>) getSession().createQuery(reqHQLGetById);
		return compteEpargneListe.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<CompteEpargne> getAllCompteEpargne() {
		
		String reqHQLGetAll = "SELECT * FROM comptesEpargnes";		
		return (List<CompteEpargne>) getSession().createQuery(reqHQLGetAll);
	}

	@SuppressWarnings("unchecked")
	public float calculerInteret(int id) {
		String reqHQLGet = "FROM comptesEpargnes WHERE id_compte_bancaire = ?";
		
		List<CompteEpargne> compteEpargnesListe = (List<CompteEpargne>) getSession().createQuery(reqHQLGet);
		CompteEpargne operation = compteEpargnesListe.get(0);
		
		float solde = operation.getSolde();
		float taux = operation.getTaux();		
		return solde*taux;
	}

}
