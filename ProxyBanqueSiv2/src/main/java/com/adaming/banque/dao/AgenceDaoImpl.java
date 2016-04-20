package com.adaming.banque.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.adaming.banque.entities.Agence;

@Repository("AgenceDao")
@Transactional
public class AgenceDaoImpl extends HibernateDaoSupport implements IAgenceDao{

	public void saveAgence(Agence agence) {
		getHibernateTemplate().setCheckWriteOperations(false);
		getHibernateTemplate().save(agence);
		
	}

	public void updateAgence(Agence agence) {
		getHibernateTemplate().update(agence);
		
	}

	public void deleteAgence(Agence agence) {
		getHibernateTemplate().delete(agence);
		
	}

	@SuppressWarnings("unchecked")
	public Agence getAgenceById(int id) {
		String reqHQLGetById = "FROM agences WHERE id = ?";

		List<Agence> agenceListe = (List<Agence>) getHibernateTemplate().find(reqHQLGetById, id);
		return agenceListe.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<Agence> getAllAgence() {
		String reqHQLGetAll= "FROM agences";
		
		List<Agence> agenceListe = (List<Agence>) getHibernateTemplate().find(reqHQLGetAll);
		return agenceListe;
	}

}
