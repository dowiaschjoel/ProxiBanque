package com.adaming.banque.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.banque.entities.Client;

@Repository("IClientDao")
@Transactional
public class ClientDaoImpl implements IClientDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}	
	
	public void saveStock(Client client) {
		getSession().save(client);

	}

	public void updateStock(Client client) {
		getSession().merge(client);

	}

	public void deleteStock(int id) {
		String reqHQLGetById = "FROM clients WHERE id = ?";
		Client result = (Client) getSession().createQuery(reqHQLGetById);

	}

	@SuppressWarnings("unchecked")
	public Client getClientById(int id) {
		String reqHQLGetById = "FROM clients WHERE id = ?";

		List<Client> clientListe = (List<Client>) getSession().createQuery(reqHQLGetById);
		return clientListe.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<Client> getAllClient() {
		
		String reqHQLGetAll = "SELECT * FROM clients";		
		return (List<Client>) getSession().createQuery(reqHQLGetAll);
	}

}
