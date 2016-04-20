package com.adaming.banque.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.adaming.banque.entities.Gerant;

@Repository("GerantDao")
@Transactional
public class GerantDaoImpl extends HibernateDaoSupport implements IGerantDao{

	public void saveGerant(Gerant gerant) {
		getHibernateTemplate().setCheckWriteOperations(false);
		getHibernateTemplate().save(gerant);
		
	}

	public void updateGerant(Gerant gerant) {
		getHibernateTemplate().update(gerant);
		
	}

	public void deleteGerant(Gerant gerant) {
		getHibernateTemplate().delete(gerant);
		
	}

	@SuppressWarnings("unchecked")
	public Gerant getGerantById(int id) {
		String reqHQLGetById = "FROM gerants WHERE id = ?";

		List<Gerant> gerantListe = (List<Gerant>) getHibernateTemplate().find(reqHQLGetById, id);
		return gerantListe.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<Gerant> getAllGerant() {
		String reqHQLGetAll= "FROM gerants";

		List<Gerant> gerantListe = (List<Gerant>) getHibernateTemplate().find(reqHQLGetAll);
		return gerantListe;
	}

	
}
