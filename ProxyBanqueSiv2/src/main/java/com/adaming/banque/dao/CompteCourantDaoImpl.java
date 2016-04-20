package com.adaming.banque.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.banque.entities.CompteCourant;

@Repository("ICompteCourantDao")
@Transactional
public class CompteCourantDaoImpl implements ICompteCourantDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}	
	
	public void saveCompteCourant(CompteCourant compteCourant) {
		getSession().save(compteCourant);

	}

	public void updateCompteCourant(CompteCourant compteCourant) {
		getSession().update(compteCourant);

	}

	@SuppressWarnings("unchecked")
	public void deleteCompteCourant(int id) {
		String reqHQLGetById = "FROM comptesCourants WHERE id_compte_bancaire = ?";
		List<CompteCourant> result = (List<CompteCourant>) getSession().createQuery(reqHQLGetById);
		result.get(0);  
	    getSession().delete(result);  
	}

	@SuppressWarnings("unchecked")
	public CompteCourant getCompteCourantById(int id) {
		String reqHQLGetById = "FROM comptesCourants WHERE id_compte_bancaire = ?";

		List<CompteCourant> compteCourantListe = (List<CompteCourant>) getSession().createQuery(reqHQLGetById);
		return compteCourantListe.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<CompteCourant> getAllCompteCourant() {
		
		String reqHQLGetAll = "SELECT * FROM comptesCourants";		
		return (List<CompteCourant>) getSession().createQuery(reqHQLGetAll);
	}

}
