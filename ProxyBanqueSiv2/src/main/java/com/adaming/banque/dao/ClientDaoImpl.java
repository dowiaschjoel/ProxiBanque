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
		// TODO Auto-generated method stub

	}

	public void deleteStock(Client client) {
		// TODO Auto-generated method stub

	}

	public Client getClientById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Client> getAllClient() {
		// TODO Auto-generated method stub
		return null;
	}

}
