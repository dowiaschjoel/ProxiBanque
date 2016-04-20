package com.adaming.banque.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.adaming.banque.entities.ConseillerClientele;

@Repository("ConseillerDao")
@Transactional
public class ConseillerDaoImpl extends HibernateDaoSupport implements IConseillerDao {

//	@Autowired
//	private SessionFactory sessionFactory;
	
//	public ConseillerDaoImpl(SessionFactory sessionFactory) {
//        setSessionFactory(sessionFactory);
//    }
	
//	public Session getSession(){
//		return sessionFactory.getCurrentSession();
//	}
	
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
