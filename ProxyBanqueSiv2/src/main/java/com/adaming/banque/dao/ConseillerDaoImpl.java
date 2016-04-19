package com.adaming.banque.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.adaming.banque.entities.ConseillerClientele;

public class ConseillerDaoImpl extends HibernateDaoSupport implements IConseillerDao {

	public void saveConseiller(ConseillerClientele conseiller) {
		getHibernateTemplate().setCheckWriteOperations(false);
		getHibernateTemplate().save(conseiller);
	}

	public void updateConseiller(ConseillerClientele conseiller) {
		getHibernateTemplate().update(conseiller);	
	}

	public void deleteConseiller(ConseillerClientele conseiller) {
		getHibernateTemplate().delete(conseiller);
	}

	@SuppressWarnings("unchecked")
	public ConseillerClientele getConseillerById(int id) {
		String reqHQLGetById = "FROM conseillers WHERE id = ?";

		List<ConseillerClientele> conseillerListe = (List<ConseillerClientele>) getHibernateTemplate().find(reqHQLGetById, id);
		return conseillerListe.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<ConseillerClientele> getAllConseiller() {
		String reqHQLGetAll= "conseillers";

		List<ConseillerClientele> conseillerListe = (List<ConseillerClientele>) getHibernateTemplate().find(reqHQLGetAll);
		return conseillerListe;
	}

}
